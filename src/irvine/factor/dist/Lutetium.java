package irvine.factor.dist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Distributed factoring task server.
 *
 * @author Sean A. Irvine
 */
public class Lutetium {

  private static class HostRecord {
    private long mCount;
    private String mLastDate;

    @Override
    public String toString() {
      return mLastDate + " " + mCount;
    }
  }

  private static final int DEFAULT_PORT = 11711;

  private final ArrayList<Job> mJobs = new ArrayList<>();
  private ServerSocket mSocket;
  private int mIndex = 0;
  private final HashMap<String, HostRecord> mHosts = new HashMap<>();

  /**
   * Construct a new distributed factoring service.
   * @param port port number
   */
  public Lutetium(final int port) {
    try {
      mSocket = new ServerSocket(port);
    } catch (final IOException e) {
      e.printStackTrace();
    }
  }

  /** Construct a new distributed factoring service. */
  public Lutetium() {
    this(DEFAULT_PORT);
  }

  /**
   * Add a new job.
   * @param s job description
   * @return true if added
   */
  public boolean add(final String s) {
    // input should be add~name~bound~target~number
    if (s == null) {
      return false;
    }
    final int a = s.indexOf('~');
    if (a == -1) {
      return false;
    }
    final int b = s.indexOf('~', a + 1);
    if (b == -1) {
      return false;
    }
    final int c = s.indexOf('~', b + 1);
    if (c == -1) {
      return false;
    }
    final int d = s.indexOf('~', c + 1);
    if (d == -1) {
      return false;
    }
    final int e = s.indexOf('~', d + 1);
    if (e != -1) {
      return false;
    }
    final String name = s.substring(a + 1, b);
    // Check name does not already exist
    for (final Job j : mJobs) {
      if (j.getName().equals(name)) {
        return false;
      }
    }
    try {
      final long bound = Long.parseLong(s.substring(b + 1, c));
      final int target = Integer.parseInt(s.substring(c + 1, d));
      mJobs.add(new Job(name, bound, target, s.substring(d + 1)));
    } catch (final RuntimeException ex) {
      return false;
    }
    return true;
  }

  /**
   * Remove a job.
   *
   * @param s description of job to remove
   */
  public void remove(final String s) {
    // input should be remove~name
    try {
      if (s == null) {
        return;
      }
      final int a = s.indexOf('~');
      if (a == -1) {
        return;
      }
      final int b = s.indexOf('~', a + 1);
      if (b != -1) {
        return;
      }
      final String name = s.substring(a + 1);
      // find the job
      for (int i = 0; i < mJobs.size(); ++i) {
        final Job j = mJobs.get(i);
        if (j.getName().equals(name)) {
          mJobs.remove(i);
          break;
        }
      }
    } catch (final RuntimeException e) {
      // ignore exceptions
    }
  }

  /**
   * Report a result.
   *
   * @param s result description
   */
  public void result(final String s) {
    // input should be result~name~hostname~(factor|fail)
    if (s == null) {
      return;
    }
    final int a = s.indexOf('~');
    if (a == -1) {
      return;
    }
    final int b = s.indexOf('~', a + 1);
    if (b == -1) {
      return;
    }
    final int c = s.indexOf('~', b + 1);
    if (c == -1) {
      return;
    }
    final int d = s.indexOf('~', c + 1);
    if (d != -1) {
      return;
    }
    final String name = s.substring(a + 1, b);
    final String host = s.substring(b + 1, c);
    final String factor = s.substring(c + 1);

    System.out.println(name + " " + host + " " + factor);

    // update the count for the host
    final String date = new SimpleDateFormat("YYYY-MM-dd").format(new Date());
    final HostRecord record = mHosts.get(host);
    if (record != null) {
      record.mCount++;
      record.mLastDate = date;
    } else {
      final HostRecord rec = new HostRecord();
      rec.mCount = 1;
      rec.mLastDate = date;
      mHosts.put(host, rec);
    }

    // find the job
    for (final Job j : mJobs) {
      if (j.getName().equals(name)) {
        if (!"fail".equals(factor)) {
          j.setFinished();
          j.setFactor(factor);
        }
        j.bumpCount();
        break;
      }
    }

    if (!"fail".equals(factor)) {
      System.out.println("FACTOR: " + factor + " for " + name + " (" + host + ")");
    }
  }


  /**
   * Generate the current status of all numbers queued.
   *
   * @return status update
   */
  public String status() {
    final StringBuilder b = new StringBuilder();
    b.append("Host records:\n\n");
    for (final Map.Entry<String, HostRecord> e : mHosts.entrySet()) {
      b.append(e.getValue()).append(' ').append(e.getKey()).append('\n');
    }
    b.append("\nStatus of all targets:\n\n");
    for (final Job j : mJobs) {
      b.append(j.getName()).append(' ').append(j.getRatio()).append(" @ ").
        append(j.getBound()).append(" C").append(j.getComposite().length());
      if (j.getStatus()) {
        b.append(" FINISHED ");
      }
      if (j.getFactor() != null) {
        b.append(j.getFactor());
      }
      b.append('\n');
    }
    return b.toString();
  }

  /**
   * Generate dump of all numbers queued but not yet finished.
   *
   * @return status update
   */
  public String dump() {
    final StringBuilder b = new StringBuilder();
    for (final Job j : mJobs) {
      final int remaining = j.getRemaining();
      if (remaining > 0) {
        b.append("add~")
          .append(j.getName())
          .append('~')
          .append(j.getBound())
          .append('~')
          .append(remaining)
          .append('~')
          .append(j.getComposite())
          .append('\n');
      }
    }
    return b.toString();
  }

  /**
   * Get the ECM parameters for the next available job.
   *
   * @return ECM parameters
   */
  public String get() {

    if (mJobs.isEmpty()) {
      return ""; // no work available
    }

    // be careful of case where all list elements are finished
    final int oldindex = mIndex;
    Job j;
    do {
      mIndex %= mJobs.size();
      j = mJobs.get(mIndex++);
      mIndex %= mJobs.size();
    } while (j.getStatus() && mIndex != oldindex);

    if (j.getStatus()) {
      return ""; // no work available
    } else {
      // have an unfinished job now, spit out requirements
      return j.getName() + " " + j.getBound() + " " + j.getComposite();
    }
  }

  /** Master processing loop. */
  public void process() {
    while (true) {
      try {
        final Socket s = mSocket.accept();
        final InputStream is = s.getInputStream();

        // get the command and take appropriate action
        try (OutputStream os = s.getOutputStream()) {
          try (final BufferedReader r = new BufferedReader(new InputStreamReader(is))) {
            final String line = r.readLine();
            if (line == null) {
              System.out.println("Command was null");
            } else if ("status".equals(line)) {
              os.write(status().getBytes(StandardCharsets.US_ASCII));
            } else if ("dump".equals(line)) {
              os.write(dump().getBytes(StandardCharsets.US_ASCII));
            } else if ("get".equals(line)) {
              os.write(get().getBytes(StandardCharsets.US_ASCII));
            } else if (line.startsWith("add")) {
              add(line);
            } else if (line.startsWith("result")) {
              result(line);
            } else if (line.startsWith("remove")) {
              remove(line);
            } else if ("quit".equals(line)) {
              System.out.println("Quit command received");
              os.write("Quit command received, current status was:\n".getBytes(StandardCharsets.US_ASCII));
              os.write(status().getBytes(StandardCharsets.US_ASCII));
              os.write(dump().getBytes(StandardCharsets.US_ASCII));
              return;
            }
          }
        } catch (final IOException e) {
          e.printStackTrace();
        } finally {
          s.close();
        }
      } catch (final IOException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * Main program.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    new Lutetium().process();
  }

}

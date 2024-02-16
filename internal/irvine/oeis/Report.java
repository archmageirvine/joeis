package irvine.oeis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.oeis.cons.RealConstantSequence;
import irvine.oeis.producer.PariSequence;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.recur.LinearRecurrence;
import irvine.util.CliFlags;
import irvine.util.LimitedLengthPriorityQueue;
import irvine.util.string.Date;
import irvine.util.string.StringUtils;

/**
 * Generate a report on implemented sequences.
 * @author Sean A. Irvine
 */
public final class Report {

  private Report() { }

  // Needs to be above maximum id currently assigned in the OEIS.
  private static final int MAX_ID = 400000;

  private static final String QUIET_FLAG = "quiet";
  private static final String OFFSETS_FLAG = "offsets";

  private static String rightAlign(final int cnt) {
    final String s = StringUtils.rep(' ', 12) + cnt;
    return s.substring(s.length() - 12);
  }

  /** Hold information relating to offsets. */
  private static final class OffsetInfo {
    private final int mOffset;
    private final String mLabel;

    private OffsetInfo(final int offset, final String label) {
      mOffset = offset;
      mLabel = label;
    }
  }

  private static int loadOffSetInformation(final String fileName, final OffsetInfo[] offsets, final boolean verbose) throws IOException {
    int outOfRangeOffsets = 0;
    try (final BufferedReader reader = new BufferedReader("-".equals(fileName) ? new InputStreamReader(System.in) : new FileReader(fileName))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.isBlank() || line.startsWith("#")) {
          continue;
        }
        final String[] parms = line.split("\\s+");
        final String aNumber = parms[0];
        try {
          final int offset = Integer.parseInt(parms[1]);
          final String superClass = parms.length > 2 ? parms[2] : "";
          final int id = Integer.parseInt(aNumber.substring(1));
          offsets[id] = new OffsetInfo(offset, superClass);
        } catch (final NumberFormatException e) {
          ++outOfRangeOffsets;
          if (verbose) {
            StringUtils.message(aNumber + " has offset " + parms[1] + " and will be ignored");
          }
        }
      }
    }
    return outOfRangeOffsets;
  }

  private static final CliFlags.Validator VALIDATOR = flags -> {
    if (flags.isSet(OFFSETS_FLAG)) {
      final String of = (String) flags.getValue(OFFSETS_FLAG);
      if (!"-".equals(of) && !new File(of).canRead()) {
        flags.setParseMessage("Offsets file \"" + of + "\" does not exist or is unreadable");
        return false;
      }
    }
    return true;
  };

  /**
   * Main program.
   * @param args ignored
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = new CliFlags("Report");
    flags.setValidator(VALIDATOR);
    flags.registerOptional('q', QUIET_FLAG, "do not display progress messages.");
    flags.registerOptional(OFFSETS_FLAG, String.class, "FILE", "specify file containing expected offsets (or \"-\" for stdin)");
    flags.setFlags(args);

    final boolean verbose = !flags.isSet(QUIET_FLAG);
    if (verbose) {
      StringUtils.message("Starting report");
    }

    final OffsetInfo[] offsets = new OffsetInfo[MAX_ID];
    if (flags.isSet(OFFSETS_FLAG)) {
      final String offsetsFile = (String) flags.getValue(OFFSETS_FLAG);
      final int outOfRange = loadOffSetInformation(offsetsFile, offsets, verbose);
      if (verbose) {
        StringUtils.message("Loaded offset information from \"" + offsetsFile + "\" (" + outOfRange + " skipped due to out of range)");
      }
    }

    int total = 0;
    int dead = 0;
    int noncomputable = 0;
    int recurrence = 0;
    int cons = 0;
    int pari = 0;
    int hasCorrectOffset = 0;
    int conjectural = 0;
    int direct = 0;
    final List<String> failedOffsetChecks = new ArrayList<>();
    final LimitedLengthPriorityQueue<String> slowest = new LimitedLengthPriorityQueue<>(10, true);
    for (int a = 1; a < MAX_ID; ++a) {
      final String aNumber = SequenceFactory.getCanonicalId("A" + a);
      if (verbose && a % 10000 == 0) {
        StringUtils.message("Processing " + aNumber);
      }
      try {
        final long t = System.currentTimeMillis();
        final Sequence seq = SequenceFactory.sequence(aNumber);
        final long constructTime = System.currentTimeMillis() - t;
        slowest.add(constructTime, aNumber);
        ++total;
        if (offsets[a] != null) {
          // Check if offset matches expected information
          final int claimedOffset = seq.getOffset();
          if (claimedOffset == offsets[a].mOffset) {
            ++hasCorrectOffset;
          } else {
            failedOffsetChecks.add(aNumber + " " + claimedOffset + " -> " + offsets[a].mOffset + "\t" + offsets[a].mLabel);
          }
        }
        if (seq instanceof DeadSequence) {
          ++dead;
        }
        if (seq instanceof NoncomputableSequence) {
          ++noncomputable;
        }
        if (seq instanceof Conjectural) {
          ++conjectural;
        }
        if (seq instanceof HolonomicRecurrence || seq instanceof LinearRecurrence) {
          ++recurrence;
        }
        if (seq instanceof RealConstantSequence) {
          ++cons;
        }
        if (seq instanceof PariSequence) {
          ++pari;
        }
        if (seq instanceof DirectSequence) {
          ++direct;
        }
      } catch (final UnimplementedException e) {
        // too bad
      }
    }
    System.out.println("Total sequences implemented: " + rightAlign(total));
    System.out.println("DirectSequence:              " + rightAlign(direct));
    System.out.println("Recurrences:                 " + rightAlign(recurrence));
    System.out.println("RealConstantSequence:        " + rightAlign(cons));
    System.out.println("DeadSequence:                " + rightAlign(dead));
    System.out.println("NoncomputableSequence:       " + rightAlign(noncomputable));
    System.out.println("Conjectural:                 " + rightAlign(conjectural));
    System.out.println();
    System.out.println("PariSequence:                " + rightAlign(pari));
    System.out.println();
    System.out.println("Slowest constructors (ms):");
    final List<LimitedLengthPriorityQueue.Node<String>> lst = new ArrayList<>(slowest);
    Collections.reverse(lst);
    for (final LimitedLengthPriorityQueue.Node<String> node : lst) {
      System.out.println(node.getValue() + " " + node.getScore());
    }
    System.out.println();
    if (hasCorrectOffset > 0 || !failedOffsetChecks.isEmpty()) {
      System.out.println("Offsets:");
      System.out.println("  Valid offset:             " + rightAlign(hasCorrectOffset));
      System.out.println("  Wrong offset:             " + rightAlign(failedOffsetChecks.size()));
      for (final String failedOffset : failedOffsetChecks) {
        System.out.println("WARNING: " + failedOffset);
      }
      System.out.println();
    }
    if (verbose) {
      StringUtils.message("Finished report at " + Date.now());
    }
  }
}


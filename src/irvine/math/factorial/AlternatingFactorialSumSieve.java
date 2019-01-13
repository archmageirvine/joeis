package irvine.math.factorial;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.util.io.StreamProcessor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Find small prime factors of a(n); the alternating sum of factorials.
 * Words in a similar way to <code>FactorialSieve</code>.
 *
 * @author Sean A. Irvine
 */
public class AlternatingFactorialSumSieve extends StreamProcessor {

  private static String getDate() {
    final StringBuilder sb = new StringBuilder();
    final Calendar cal = new GregorianCalendar();
    sb.append(cal.get(Calendar.YEAR)).append('-');
    final int month = 1 + cal.get(Calendar.MONTH);
    if (month < 10) {
      sb.append('0');
    }
    sb.append(month).append('-');
    final int date = cal.get(Calendar.DATE);
    if (date < 10) {
      sb.append('0');
    }
    sb.append(date).append(' ');
    return sb.toString();
  }

  private static final String DATE = getDate();

  /** Prime number source. */
  private static final Fast FAST = new Fast();

  /** Known factors. */
  private final ArrayList<ArrayList<Z>> mFactors;
  /** Count of composites with no known factors. */
  private int mComposites;
  /** Maximum. */
  private int mMaximum;

  AlternatingFactorialSumSieve(final int maxn, final File known) throws IOException {
    if (maxn < 0) {
      throw new RuntimeException("Bad range.");
    }
    mMaximum = maxn;
    mComposites = maxn;
    mFactors = new ArrayList<>(mComposites);
    for (int k = 0; k < mComposites; ++k) {
      mFactors.add(null);
    }

    // read all known factors
    if (known != null) {
      process(known);
    }
  }

  private static Z alternatingFactorial(final long n) {
    Z a = Z.ZERO;
    Z f = Z.ONE;
    final long parity = n & 1;
    for (long k = 1; k <= n; ++k) {
      f = f.multiply(k);
      if ((k & 1) == parity) {
        a = a.add(f);
      } else {
        a = a.subtract(f);
      }
    }
    return a;
  }

  private void add(final int nn, final Z p, final boolean print) {
    final int n = nn - 1;
    if (n < 0 || n >= mFactors.size()) {
      return; // out of range
    }
    if (mFactors.get(n) == null) {
      --mComposites;
      mFactors.set(n, new ArrayList<>());
    }
    final ArrayList<Z> s = mFactors.get(n);
    for (final Z value : s) {
      if (value.equals(p) && nn != 27) {
        System.err.println("Known: A(" + nn + ") " + p);
        return; // known factor
      }
    }
    if (print) {
      System.out.println(DATE + "A(" + nn + ") " + p + " SAI");
    }
    s.add(p);
  }

  private void printMissing() {
    for (int k = 3; k < mFactors.size(); ++k) {
      if (mFactors.get(k - 1) == null) {
        System.out.println(k + " " + alternatingFactorial(k));
      }
    }
  }

  @Override
  public void process(final String line) {
    final String[] parts = line.split(" ");
    final String nn = parts[1];
    final int left = nn.indexOf('(');
    final int right = nn.indexOf(')');
    final int n = Integer.parseInt(nn.substring(left + 1, right));
    try {
      if ("P".equals(parts[2]) || "PSP".equals(parts[2])) {
        add(n, Z.ZERO, false);
      } else {
        add(n, new Z(parts[2]), false);
      }
    } catch (final NumberFormatException e) {
      System.err.println("Skip: " + line);
    }
  }

  /**
   * Start sieving from p.
   *
   * @param p prime to start sieving at
   * @param pend prime to stop sieving at
   */
  public void sieve(long p, final long pend) {
    System.err.println("Sieving from " + p + " to " + pend);
    long lastlog = 0;
    p -= 1;
    final long limit = Math.min(Long.MAX_VALUE / mMaximum, pend);
    while (true) {
      p = FAST.nextPrime(p);
      if (p <= 0 || p > limit) {
        break;
      }
      if ((lastlog ^ p) > 0xfff) {
        System.err.println("p=" + p + " c=" + mComposites);
        lastlog = p;
      }
      long r = 1;
      long a = 1;
      int f = 1;
      final int l = Math.min(mMaximum, (int) p);
      while (f <= l) {
        if (a == 0) {
          add(f, Z.valueOf(p), true);
        }
        ++f;
        r *= f;
        r %= p;
        a = r - a;
        a %= p;
      }
    }
  }

  /**
   * Perform the sieving in the specified range or print numbers with no known factors.
   *
   * @param args file name and bounds parameters
   * @exception Exception if an error occurs
   */
  public static void main(final String[] args) throws Exception {
    final AlternatingFactorialSumSieve fs = new AlternatingFactorialSumSieve(3612703, new File(args[0]));
    if ("--missing".equals(args[1])) {
      fs.printMissing();
    } else {
      fs.sieve(Long.parseLong(args[1]), Long.parseLong(args[2]));
    }
  }

}

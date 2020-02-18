package irvine.oeis.a332;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A332580.
 * @author Sean A. Irvine
 */
public class A332580 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = -0;

  private long findK(final long n) {
    long k = 0;
    final StringBuilder sb = new StringBuilder().append(n);
    do {
      sb.append(n + ++k);
      if (mVerbose && (k % 10000) == 0) {
        StringUtils.message("n=" + n + " k=" + k);
      }
    } while (((n + k) & 1) == 1 || new Z(sb).mod(n + k + 1) != 0);
    return k;
  }

  @Override
  public Z next() {
    return Z.valueOf(findK(++mN));
  }

  /**
   * Run the search for a particular value
   * @param args values to try
   */
  public static void main(final String[] args) {
    final A332580 seq = new A332580();
    for (final String v : args) {
      System.out.println(v + " " + seq.findK(Long.parseLong(v)));
    }
  }
}

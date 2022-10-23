package irvine.oeis.a332;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A332580 a(n) = minimal positive k such that the concatenation of the decimal digits of n,n+1,...,n+k is divisible by n+k+1, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A332580 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = -0;

  private long findK(final long n) {
    long k = 0;
    long mul = 10;
    while (mul <= n) {
      mul *= 10;
    }
    Z concat = Z.valueOf(n);
    do {
      final long u = n + ++k;
      if (u == mul) {
        mul *= 10;
      }
      concat = concat.multiply(mul).add(u);
      if (mVerbose && (k % 10000) == 0) {
        StringUtils.message("n=" + n + " k=" + k);
      }
    } while (((n + k) & 1) == 1 || concat.mod(n + k + 1) != 0);
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

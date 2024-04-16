package irvine.oeis.a011;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011753 Smallest number beginning with n and having n different prime divisors (which may be repeated).
 * @author Sean A. Irvine
 */
public class A011753 extends Sequence1 {

  // This is too slow for more than a few terms

  private long mN = 0;

  @Override
  public Z next() {
    Z prefix = Z.valueOf(++mN);
    long limit = 1;
    while (true) {
      prefix = prefix.multiply(10);
      limit *= 10;
      long m = 0;
      while (true) {
        final Z v = prefix.add(m);
        if (Functions.OMEGA.i(v) == mN) {
          return v;
        }
        if (++m == limit) {
          break;
        }
      }
    }
  }
}

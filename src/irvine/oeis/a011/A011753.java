package irvine.oeis.a011;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011753 Smallest number beginning with n and having n different prime divisors (which may be <code>repeated)</code>.
 * @author Sean A. Irvine
 */
public class A011753 implements Sequence {

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
        if (Cheetah.factor(v).omega() == mN) {
          return v;
        }
        if (++m == limit) {
          break;
        }
      }
    }
  }
}

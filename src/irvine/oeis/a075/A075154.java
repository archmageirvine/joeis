package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075154 a(n) is the smallest multiple of n such that a(n) mod 100 = n and S(n)=n where S(n) is the sum of the base-ten digits of n, or 0 if no such a(n) exists.
 * @author Sean A. Irvine
 */
public class A075154 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 99) {
      return null;
    }
    if (mN == 11) {
      return Z.ZERO;
    }
    long k = mN;
    while (true) {
      if (k % 100 == mN && Functions.DIGIT_SUM.l(k) == mN) {
        return Z.valueOf(k);
      }
      k += mN;
    }
  }
}

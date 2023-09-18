package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A065902 Smallest prime p such that n is a solution mod p of x^4 = 2, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A065902 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    for (final Z p : Jaguar.factor(mN.pow(4).subtract(2)).toZArray()) {
      if (p.compareTo(mN) > 0) {
        return p;
      }
    }
    return Z.ZERO;
  }
}

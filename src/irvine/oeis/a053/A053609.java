package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A053609 Primes of form x^2+1 where x=LCM(n) for some n.
 * @author Sean A. Irvine
 */
public class A053609 extends A003418 {

  private Z mPrev = Z.ZERO;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z lcm = super.next();
      final Z t = lcm.square().add(1);
      if (t.isProbablePrime() && !mPrev.equals(lcm)) {
        mPrev = lcm;
        return t;
      }
    }
  }
}

package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a075.A075059;

/**
 * A049536 Primes of the form lcm(1, ..., n) + 1 = A003418(n) + 1.
 * @author Sean A. Irvine
 */
public class A049536 extends A075059 {

  private Z mPrev = Z.ZERO;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.equals(mPrev) && t.isProbablePrime()) {
        mPrev = t;
        return t;
      }
    }
  }
}


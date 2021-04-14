package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038703 Primes p such that p^2 mod q is odd, where q is the previous prime.
 * @author Sean A. Irvine
 */
public class A038703 extends A000040 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.square().mod(t).isOdd()) {
        return mA;
      }
    }
  }
}

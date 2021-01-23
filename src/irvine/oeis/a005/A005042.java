package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A005042 Primes formed by the initial digits of the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A005042 extends A000796 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    do {
      mA = mA.multiply(10).add(super.next());
    } while (!mA.isProbablePrime());
    return mA;
  }
}

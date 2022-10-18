package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000928;

/**
 * A060012 Lesser of irregular twin primes.
 * @author Sean A. Irvine
 */
public class A060012 extends A000928 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).equals(Z.TWO)) {
        return t;
      }
    }
  }
}

package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A053872 Primes arising in A053782.
 * @author Sean A. Irvine
 */
public class A053872 extends A002808 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(super.next());
      if (mA.isProbablePrime()) {
        return mA;
      }
    }
  }
}

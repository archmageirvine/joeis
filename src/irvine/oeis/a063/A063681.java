package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063681 Primes p such that 2p+7 is a power of three.
 * @author Sean A. Irvine
 */
public class A063681 extends Sequence1 {

  private Z mT = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(3);
      final Z a = mT.subtract(7).divide2();
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}

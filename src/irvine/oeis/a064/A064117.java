package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064117 Primes formed by the initial digits of the decimal expansion of the golden ratio phi = (1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A064117 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(10);
      final Z t = CR.PHI.multiply(mT).floor();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

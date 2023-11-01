package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002384 Numbers m such that m^2 + m + 1 is prime.
 * @author Sean A. Irvine
 */
public class A002384 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.add(1).multiply(mN).add(1);
      if (m.isProbablePrime()) {
        return mN;
      }
    }
  }
}

package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046756 Numbers k such that d(k)^4 divides k.
 * @author Sean A. Irvine
 */
public class A046756 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Jaguar.factor(mN).sigma0().pow(4)).isZero()) {
        return mN;
      }
    }
  }
}

package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023534 Numbers n such that the largest power of 2 dividing n equals 2^omega(n).
 * @author Sean A. Irvine
 */
public class A023534 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int omega = Jaguar.factor(mN).omega();
      mN.makeOdd();
      if (omega == mN.auxiliary()) {
        return mN;
      }
    }
  }
}

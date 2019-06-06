package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023534 Numbers n such that the largest power of 2 dividing n equals <code>2^omega(n)</code>.
 * @author Sean A. Irvine
 */
public class A023534 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int omega = Cheetah.factor(mN).omega();
      mN.makeOdd();
      if (omega == mN.auxiliary()) {
        return mN;
      }
    }
  }
}

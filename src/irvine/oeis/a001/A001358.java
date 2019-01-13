package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001358.
 * @author Sean A. Irvine
 */
public class A001358 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int s = Cheetah.factor(mN).isSemiprime();
      if (s == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException();
      }
      if (s == FactorSequence.YES) {
        return mN;
      }
    }
  }
}

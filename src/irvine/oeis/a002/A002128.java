package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002128.
 * @author Sean A. Irvine
 */
public class A002128 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    final Z t = Z.valueOf(mN).multiply(40).subtract(100).multiply(mN).add(37);
    return fs.sigma(5).multiply(3).subtract(fs.sigma(3).multiply(30 * mN - 50)).add(fs.sigma().multiply(t)).divide(1920);
  }
}

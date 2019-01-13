package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002127.
 * @author Sean A. Irvine
 */
public class A002127 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    return fs.sigma(3).subtract(fs.sigma().multiply(2 * mN - 1)).divide(8);
  }
}

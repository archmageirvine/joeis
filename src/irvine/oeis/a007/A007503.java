package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007503.
 * @author Sean A. Irvine
 */
public class A007503 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    return fs.sigma().add(fs.sigma0());
  }
}

package irvine.oeis.a016;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016006 a(n) = (tau(n^10)+9)/10.
 * @author Sean A. Irvine
 */
public class A016006 implements Sequence {

  private final Cheetah mFactor = new Cheetah();
  protected long mN = 0;

  protected int power() {
    return 10;
  }

  @Override
  public Z next() {
    final FactorSequence fs = new FactorSequence();
    fs.add(++mN, FactorSequence.UNKNOWN, power());
    mFactor.factor(fs);
    return Z.valueOf((fs.sigma0() + power() - 1) / power());
  }
}

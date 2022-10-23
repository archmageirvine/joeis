package irvine.oeis.a093;

import irvine.factor.factor.Fermat;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A093076 Number of steps to factor n!+1 using Fermat's factorization method.
 * @author Sean A. Irvine
 */
public class A093076 extends Sequence2 {

  private final Fermat mFactor = new Fermat();
  private int mN = 1;
  private Z mF = Z.ONE;

  {
    mFactor.setMaxSteps(Long.MAX_VALUE);
  }

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    final FactorSequence fs = new FactorSequence(mF.add(1));
    mFactor.factor(fs);
    return Z.valueOf(mFactor.getSteps());
  }
}


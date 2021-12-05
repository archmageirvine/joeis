package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053048 EulerPhi is iterated with initial value n!; a(n) = number of terminal iterations applied to powers of 2 arising in the iteration.
 * @author Sean A. Irvine
 */
public class A053048 implements Sequence {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  protected int mN = 0;

  @Override
  public Z next() {
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(++mN)));
    if (mN <= 2) {
      return Z.valueOf(mN - 1);
    }
    FactorSequence fs = mFactorSequence;
    Z s;
    do {
      s = fs.phi();
      fs = Jaguar.factor(s);
    } while (!Z.ONE.equals(s.makeOdd()));
    return Z.valueOf(s.auxiliary());
  }
}

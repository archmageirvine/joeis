package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053045 a(n) is the number of powers of 2 among the iterates of the Euler phi function when it is iterated with initial value n!.
 * @author Sean A. Irvine
 */
public class A053045 extends Sequence1 {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  protected int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(mN)));
    if (mN == 2) {
      return Z.TWO;
    }
    FactorSequence fs = mFactorSequence;
    Z s;
    do {
      s = fs.phi();
      fs = Jaguar.factor(s);
    } while (!Z.ONE.equals(s.makeOdd()));
    return Z.valueOf(1 + s.auxiliary());
  }
}

package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053046 a(n) is the number of terms that are not powers of 2 among the iterates of the Euler phi function when it is iterated with initial value n!.
 * @author Sean A. Irvine
 */
public class A053046 extends Sequence1 {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  protected int mN = 0;

  @Override
  public Z next() {
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(++mN)));
    if (mN <= 2) {
      return Z.ZERO;
    }
    long cnt = 0;
    FactorSequence fs = mFactorSequence;
    Z s;
    do {
      ++cnt;
      s = fs.phi();
      fs = Jaguar.factor(s);
    } while (!Z.ONE.equals(s.makeOdd()));
    return Z.valueOf(cnt);
  }
}

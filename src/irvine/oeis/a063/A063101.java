package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063101 a(n) is the number of divisors of n!*(n! + 1)/2.
 * @author Sean A. Irvine
 */
public class A063101 extends Sequence0 {

  // Use prime division for n! part and Jaguar for n!+1 part
  private final PrimeDivision mPrimeDivision = new PrimeDivision();
  private final FactorSequence mFactorSequence = new FactorSequence();
  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    if (mN > 2) { // > 2 to handle the /2 in final answer
      mFactorSequence.add(mN, FactorSequence.UNKNOWN, 1);
      mPrimeDivision.factor(mFactorSequence);
    }
    mF = mF.multiply(mN);
    final FactorSequence fs = Jaguar.factor(mF.add(1));
    fs.merge(mFactorSequence);
    return fs.sigma0();
  }
}

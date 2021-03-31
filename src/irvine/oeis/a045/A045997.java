package irvine.oeis.a045;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045997 Number of iterations required to reach stationary value when applying repeatedly applying d, the number of divisors function, to n!.
 * @author Sean A. Irvine
 */
public class A045997 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final FactorSequence mFS = new FactorSequence();
  private long mN = -1;
  
  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    mFS.add(mN, FactorSequence.UNKNOWN);
    if (mN == 2) {
      return Z.ZERO;
    }
    mFactor.factor(mFS);
    Z t = mFS.sigma0();
    long c = 1;
    while (t.compareTo(Z.THREE) >= 0) {
      ++c;
      t = mFactor.factorize(t).sigma0();
    }
    return Z.valueOf(c);
  }
}

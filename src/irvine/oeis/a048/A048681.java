package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048681 Maximum over k of the largest squarefree number dividing a value of binomial(n,k).
 * @author Sean A. Irvine
 */
public class A048681 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      final Z sf = mFactor.factorize(Binomial.binomial(mN, k)).squareFreeKernel();
      if (sf.compareTo(max) > 0) {
        max = sf;
      }
    }
    return max;
  }
}


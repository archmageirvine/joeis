package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048684 Multiplicity of maximal squarefree kernel numbers applied to C(n,k) coefficients.
 * @author Sean A. Irvine
 */
public class A048684 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    long cnt = 0;
    for (long k = 0; k <= mN / 2; ++k) {
      final Z sf = mFactor.factorize(Binomial.binomial(mN, k)).squareFreeKernel();
      final int c = sf.compareTo(max);
      if (c > 0) {
        max = sf;
        cnt = 2 * k == mN ? 1 : 2;
      } else if (c == 0) {
        cnt += 2 * k == mN ? 1 : 2;
      }
    }
    return Z.valueOf(cnt);
  }
}


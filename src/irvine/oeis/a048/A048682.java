package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048682 a(n) is the difference between maximal and central squarefree kernel numbers dividing values of {binomial(n,k)} or A001405(n), respectively.
 * @author Sean A. Irvine
 */
public class A048682 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  private Z squareFreePart(final long n, final long k) {
    return mFactor.factorize(Binomial.binomial(n, k)).squareFreeKernel();
  }

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      final Z sf = squareFreePart(mN, k);
      if (sf.compareTo(max) > 0) {
        max = sf;
      }
    }
    return max.subtract(squareFreePart(mN, mN / 2));
  }
}


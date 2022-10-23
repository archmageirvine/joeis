package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048279 Values of n for which no values of C(n,k) except k=0 and k=n are squarefree.
 * @author Sean A. Irvine
 */
public class A048279 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      boolean ok = true;
      for (long k = 1; k <= mN / 2; ++k) {
        if (mFactor.factorize(Binomial.binomial(mN, k)).isSquareFree()) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}


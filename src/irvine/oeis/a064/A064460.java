package irvine.oeis.a064;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064460 Number of distinct nonsquarefree entries in n-th row of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A064460 extends Sequence0 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; k <= mN / 2; ++k) {
      if (!mFactor.factorize(Binomial.binomial(mN, k)).isSquareFree()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

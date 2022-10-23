package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048276 a(n) = number of squarefree numbers among C(n,k), k=0..n.
 * @author Sean A. Irvine
 */
public class A048276 extends Sequence0 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; k <= mN / 2; ++k) {
      if (mFactor.factorize(Binomial.binomial(mN, k)).isSquareFree()) {
        cnt += 2 * k == mN ? 1 : 2;
      }
    }
    return Z.valueOf(cnt);
  }
}


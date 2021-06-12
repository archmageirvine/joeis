package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048277 Number of (not necessarily distinct) nonsquarefree numbers among C(n,k), k=0..n.
 * @author Sean A. Irvine
 */
public class A048277 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; k <= mN / 2; ++k) {
      if (!mFactor.factorize(Binomial.binomial(mN, k)).isSquareFree()) {
        cnt += 2 * k == mN ? 1 : 2;
      }
    }
    return Z.valueOf(cnt);
  }
}


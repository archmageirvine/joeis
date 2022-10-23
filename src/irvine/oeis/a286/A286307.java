package irvine.oeis.a286;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A286307 a(n) is the numerator of r(n), where r(n) = r(n-1) + r(n-2)/(2*(n-1)) with r(0) = 0, r(1) = 1.
 * @author Georg Fischer
 */
public class A286307 extends Sequence0 {

  private int mN = -1;
  private Q mS = Q.ZERO;
  private Q mT = Q.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    if (mN == 1) {
      return Z.ONE;
    }
    final Q u = mT.add(mS.divide(2 * (mN - 1)));
    mS = mT;
    mT = u;
    return u.num();
  }
}


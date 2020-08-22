package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a008.A008578;

/**
 * A024529 a(n) = s(1)*s(2)*...*s(n)*(1/s(1) - 1/s(2) + ... + c/s(n)), where s(1) = 1, s(k) = p(k-1) for k &gt;= 2 and c = (-1)^(n+1).
 * @author Sean A. Irvine
 */
public class A024529 extends A008578 {

  private Q mSum = Q.ZERO;
  private Z mProd = Z.ONE;
  private boolean mEven = false;

  @Override
  public Z next() {
    mEven = !mEven;
    final Z p = super.next();
    mSum = mSum.signedAdd(mEven, new Q(Z.ONE, p));
    mProd = mProd.multiply(p);
    return mSum.multiply(mProd).toZ();
  }
}

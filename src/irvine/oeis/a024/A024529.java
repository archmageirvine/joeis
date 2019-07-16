package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a008.A008578;

/**
 * A024529.
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

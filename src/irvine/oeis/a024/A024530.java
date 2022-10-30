package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A024530 Numerator of -Sum_{k=1..n} (-1)^k / prime(k).
 * @author Sean A. Irvine
 */
public class A024530 extends A000040 {

  {
    setOffset(0);
  }

  private Q mSum = null;
  private boolean mEven = false;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Q.ZERO;
      return Z.ZERO;
    }
    mEven = !mEven;
    final Z p = super.next();
    mSum = mSum.signedAdd(mEven, new Q(Z.ONE, p));
    return mSum.num();
  }
}

package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A024530 Numerator of -Sum_{k=1..n} (-1)^k / prime(k).
 * @author Sean A. Irvine
 */
public class A024530 extends A000040 {

  private Q mSum = Q.ZERO;
  private boolean mEven = false;

  @Override
  public Z next() {
    mEven = !mEven;
    final Z p = super.next();
    mSum = mSum.signedAdd(mEven, new Q(Z.ONE, p));
    return mSum.num();
  }
}

package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a023.A023531;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A024307 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where <code>k=[ (n+1)/2) ], s =</code> (natural numbers <code>&gt;= 2), t = A023531</code>.
 * @author Sean A. Irvine
 */
public class A024307 extends A023531 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  {
    mA.set(0);
    super.next();
  }
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (super.next().signum() > 0) {
      mA.set(mN);
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= (mN + 1) / 2; ++k) {
      if (mA.isSet(mN + 1 - k)) {
        sum = sum.add(k + 1);
      }
    }
    return sum;
  }
}

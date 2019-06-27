package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a023.A023531;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A024316 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k)</code>, where <code>k=[ (n+1)/2) ], s = A023531</code>.
 * @author Sean A. Irvine
 */
public class A024316 extends A023531 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  {
    super.next();
  }
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (super.next().signum() > 0) {
      mA.set(mN);
    }
    long sum = 0;
    for (long k = 1; k <= (mN + 1) / 2; ++k) {
      if (mA.isSet(k) && mA.isSet(mN + 1 - k)) {
        ++sum;
      }
    }
    return Z.valueOf(sum);
  }
}

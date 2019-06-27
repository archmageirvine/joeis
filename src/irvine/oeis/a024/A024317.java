package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a023.A023531;
import irvine.oeis.a023.A023532;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A024317 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where <code>k=[ (n+1)/2) ], s = A023531, t = A023532</code>.
 * @author Sean A. Irvine
 */
public class A024317 extends A023531 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private final LongDynamicBooleanArray mB = new LongDynamicBooleanArray();
  private final Sequence mBSeq = new A023532();
  {
    super.next();
    mBSeq.next();
  }
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (super.next().signum() > 0) {
      mA.set(mN);
    }
    if (mBSeq.next().signum() > 0) {
      mB.set(mN);
    }
    long sum = 0;
    for (long k = 1; k <= (mN + 1) / 2; ++k) {
      if (mA.isSet(k) && mB.isSet(mN + 1 - k)) {
        ++sum;
      }
    }
    return Z.valueOf(sum);
  }
}

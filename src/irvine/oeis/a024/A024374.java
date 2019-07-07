package irvine.oeis.a024;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a023.A023532;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A024374 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A023532, t = A001950</code> (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024374 extends A001950 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final LongDynamicBooleanArray mB = new LongDynamicBooleanArray();
  private final Sequence mBSeq = new A023532();
  {
    mBSeq.next();
    mA.add(null);
  }
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mA.add(super.next());
    if (mBSeq.next().signum() > 0) {
      mB.set(mN);
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      if (mB.isSet(k)) {
        sum = sum.add(mA.get(mN + 1 - k));
      }
    }
    return sum;
  }
}

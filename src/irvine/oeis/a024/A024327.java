package irvine.oeis.a024;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014306;
import irvine.oeis.a023.A023531;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A024327 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= floor( (n+1)/2 ), s = A023531, t = A023534</code>.
 * @author Sean A. Irvine
 */
public class A024327 extends A014306 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final LongDynamicBooleanArray mB = new LongDynamicBooleanArray();
  private final Sequence mBSeq = new A023531();
  {
    mBSeq.next();
    mA.add(super.next());
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

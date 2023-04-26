package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a058.A058515;
import irvine.util.array.DynamicLongArray;

/**
 * A063444 Smallest number such that GCD of EulerPhi of 2 consecutive integer equals 2n.
 * @author Sean A. Irvine
 */
public class A063444 extends A058515 {

  private final DynamicLongArray mFirst = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mN += 2;
    while (mFirst.get(mN) == 0) {
      ++mM;
      final int t = super.next().intValueExact();
      if (mFirst.get(t) == 0) {
        mFirst.set(t, mM);
      }
    }
    return Z.valueOf(mFirst.get(mN));
  }
}

package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A072111 Partial sum of pi(k) from k = 1 to 2^n.
 * @author Sean A. Irvine
 */
public class A072111 extends A000720 {

  private long mN = 1;
  private long mM = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mN *= 2;
    while (mM < mN) {
      ++mM;
      mSum = mSum.add(super.next());
    }
    return mSum;
  }
}

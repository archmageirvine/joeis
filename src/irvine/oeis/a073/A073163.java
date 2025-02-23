package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A073163 Partial sums of Pi(k) arising in A073162.
 * @author Sean A. Irvine
 */
public class A073163 extends A000720 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(super.next());
      if (mSum.mod(++mN) == 0) {
        return mSum;
      }
    }
  }
}

package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065095 a(1) = 1, a(n+1) is the sum of a(n) and ceiling( arithmetic mean of a(1) ... a(n) ).
 * @author Sean A. Irvine
 */
public class A065095 extends Sequence1 {

  private Z mSum = Z.ONE;
  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(mSum.add(mN - 1).divide(mN));
      mSum = mSum.add(mA);
    }
    return mA;
  }
}

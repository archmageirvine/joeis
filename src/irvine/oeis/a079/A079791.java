package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079791 a(1) = 1, a(n) = a(n-1)/n if a(n-1) is divisible by n else a(n) is the concatenation of a(n-1) and n.
 * @author Sean A. Irvine
 */
public class A079791 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      if (mA.mod(mN) == 0) {
        mA = mA.divide(mN);
      } else {
        mA = new Z(mA.toString() + mN);
      }
    }
    return mA;
  }
}


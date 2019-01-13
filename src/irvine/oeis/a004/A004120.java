package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004120.
 * @author Sean A. Irvine
 */
public class A004120 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.compareTo(Z.THREE) >= 0) {
      return mN.multiply(mN.add(11)).divide2().subtract(5);
    } else {
      return mN.add(1).square();
    }
  }
}

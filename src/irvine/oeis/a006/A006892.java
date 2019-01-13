package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006892.
 * @author Sean A. Irvine
 */
public class A006892 implements Sequence {

  private long mN = 0;
  private Z mA = Z.THREE;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.valueOf(mN);
    }
    mA = mA.add(3).divide(2).square().subtract(2);
    return mA;
  }
}


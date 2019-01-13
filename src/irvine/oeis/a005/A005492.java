package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005492.
 * @author Sean A. Irvine
 */
public class A005492 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(16).multiply(mN).add(102).multiply(mN).subtract(300).multiply(mN).add(340);
  }
}


package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005337.
 * @author Sean A. Irvine
 */
public class A005337 implements Sequence {

  private Z mN = Z.SEVEN;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(6).multiply(mN).subtract(169).multiply(mN).add(546).divide(6);
  }
}

package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005917 Rhombic dodecahedral numbers: a(n) = n^4 - (n - 1)^4.
 * @author Sean A. Irvine
 */
public class A005917 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(4).subtract(mN.subtract(1).pow(4));
  }
}

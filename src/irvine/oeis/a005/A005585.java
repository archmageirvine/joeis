package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005585.
 * @author Sean A. Irvine
 */
public class A005585 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.add(2)).multiply(mN.add(3)).multiply(mN.multiply2().add(3)).divide(120);
  }
}


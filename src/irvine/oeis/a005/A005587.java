package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005587.
 * @author Sean A. Irvine
 */
public class A005587 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(5)).multiply(mN.add(6)).multiply(mN.add(7)).divide(24);
  }
}


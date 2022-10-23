package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005571 Number of walks on cubic lattice.
 * @author Sean A. Irvine
 */
public class A005571 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(1).multiply(mN.add(3)).multiply(mN.multiply(8).add(19)).divide(3).multiply(4);
  }
}


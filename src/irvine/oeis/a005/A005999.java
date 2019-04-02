package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005999 Number of paraffins.
 * @author Sean A. Irvine
 */
public class A005999 extends A005997 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return super.next().subtract(mN.square());
  }
}


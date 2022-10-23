package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008513 Number of points on surface of 6-dimensional cube.
 * @author Sean A. Irvine
 */
public class A008513 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(1).pow(6).subtract(mN.subtract(1).pow(6));
  }
}


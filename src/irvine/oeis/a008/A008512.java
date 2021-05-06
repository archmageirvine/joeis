package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008512 Number of points on the surface of 5-dimensional cube.
 * @author Sean A. Irvine
 */
public class A008512 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(1).pow(5).subtract(mN.subtract(1).pow(5));
  }
}


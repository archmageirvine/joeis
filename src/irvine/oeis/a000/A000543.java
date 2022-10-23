package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000543 Number of inequivalent ways to color vertices of a cube using at most n colors.
 * @author Sean A. Irvine
 */
public class A000543 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z s = mN.square();
    return s.multiply(s.pow(3).add(s.multiply(17).add(6))).divide(24);
  }
}

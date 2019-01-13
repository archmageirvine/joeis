package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008355.
 * @author Sean A. Irvine
 */
public class A008355 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ZERO.equals(mN)) {
      return Z.ONE;
    }
    final Z s = mN.square();
    return s.add(1).multiply(s.multiply(9).add(1)).multiply2();
  }
}



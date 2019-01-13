package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000543.
 * @author Sean A. Irvine
 */
public class A000543 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z s = mN.square();
    return s.multiply(s.pow(3).add(s.multiply(17).add(6))).divide(24);
  }
}

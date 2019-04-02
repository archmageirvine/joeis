package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000127 Maximal number of regions obtained by joining n points around a circle by straight lines. Also number of regions in 4-space formed by n-1 hyperplanes.
 * @author Sean A. Irvine
 */
public class A000127 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z ns = mN.square();
    return ns.square()
      .subtract(ns.multiply(mN).multiply(6))
      .add(ns.multiply(23))
      .subtract(mN.multiply(18))
      .add(24)
      .divide(24);
  }
}

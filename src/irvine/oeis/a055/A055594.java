package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055594 Shortest side of congruent triangles with integer sides and positive integer area, ordered by longest side, then second longest side and finally shortest side.
 * @author Sean A. Irvine
 */
public class A055594 extends A055592 {

  @Override
  protected Z select(final Triangle t) {
    return Z.valueOf(t.right());
  }
}

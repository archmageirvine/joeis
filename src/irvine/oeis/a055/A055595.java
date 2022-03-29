package irvine.oeis.a055;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A055595 Area of congruent triangles with integer sides and positive integer area, ordered by longest side, then second longest side and finally shortest side.
 * @author Sean A. Irvine
 */
public class A055595 extends A055592 {

  @Override
  protected Z select(final Triangle t) {
    final Q s = new Q(t.left() + t.mid() + t.right(), 2);
    final Q a2 = s.multiply(s.subtract(t.left())).multiply(s.subtract(t.mid())).multiply(s.subtract(t.right()));
    return a2.toZ().sqrt();
  }
}

package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.util.Triple;

/**
 * A057101 Area of a Pythagorean triangle (ordered by the product of the sides).
 * @author Sean A. Irvine
 */
public class A057101 extends A057098 {

  @Override
  protected Z select(final Triple<Long> t) {
    return Z.valueOf(t.left()).multiply(t.mid()).divide2();
  }
}

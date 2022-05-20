package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.util.Triple;

/**
 * A057100 Hypotenuses of Pythagorean triangles (ordered by the product of the sides).
 * @author Sean A. Irvine
 */
public class A057100 extends A057098 {

  @Override
  protected Z select(final Triple<Long> t) {
    return Z.valueOf(t.right());
  }
}

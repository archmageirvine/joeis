package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.util.Triple;

/**
 * A057099 Middle side of a Pythagorean triangle (ordered by the product of the sides).
 * @author Sean A. Irvine
 */
public class A057099 extends A057098 {

  @Override
  protected Z select(final Triple<Long> t) {
    return Z.valueOf(t.mid());
  }
}

package irvine.oeis.a345;

import irvine.math.z.Z;

/**
 * A345667 a(n) is the largest prime substring of A345666(n).
 * @author Sean A. Irvine
 */
public class A345667 extends A345666 {

  @Override
  protected Z select(final Z c, final Z p) {
    return p;
  }
}

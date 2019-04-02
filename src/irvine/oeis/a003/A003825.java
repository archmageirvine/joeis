package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003825 Numbers that are the sum of two positive cubes in at least three ways (primitive solutions).
 * @author Sean A. Irvine
 */
public class A003825 extends A003824 {

  @Override
  protected Z a(final Z n) {
    return n.pow(3);
  }

  @Override
  protected int count() {
    return 4;
  }
}

package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055672 Number of right-inequivalent prime Hurwitz quaternions of norm n.
 * @author Sean A. Irvine
 */
public class A055672 extends A055671 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().divide(24);
  }
}

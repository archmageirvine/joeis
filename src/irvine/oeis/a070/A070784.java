package irvine.oeis.a070;

import irvine.math.z.Z;

/**
 * A055592.
 * @author Sean A. Irvine
 */
public class A070784 extends A070783 {

  @Override
  protected Z select(final Triangle t) {
    return Z.valueOf(t.mid());
  }
}

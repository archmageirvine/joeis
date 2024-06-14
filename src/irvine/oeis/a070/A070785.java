package irvine.oeis.a070;

import irvine.math.z.Z;

/**
 * A070785 Square of shortest side of triangles with sides whose squares are integers and with positive integer area, ordered by longest side, then second longest side and finally shortest side.
 * @author Sean A. Irvine
 */
public class A070785 extends A070783 {

  @Override
  protected Z select(final Triangle t) {
    return Z.valueOf(t.right());
  }
}

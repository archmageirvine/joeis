package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070169 Rounded total surface area of a regular tetrahedron with edge length n.
 * @author Sean A. Irvine
 */
public class A070169 extends Sequence0 {

  private static final CR SQRT3 = CR.THREE.sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    return SQRT3.multiply(++mN * mN).round();
  }
}

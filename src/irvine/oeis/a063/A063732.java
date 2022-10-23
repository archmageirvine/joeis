package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063732 Numbers whose Lucas representation excludes L_0 = 2.
 * @author Sean A. Irvine
 */
public class A063732 extends Sequence1 {

  private static final CR C  = CR.THREE.subtract(CR.PHI);
  private long mN = 0;

  @Override
  public Z next() {
    return C.multiply(++mN).floor().subtract(1);
  }
}

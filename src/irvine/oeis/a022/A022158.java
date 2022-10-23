package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022158 First column of spectral array W(sqrt(3)).
 * @author Sean A. Irvine
 */
public class A022158 extends Sequence1 {

  private static final CR SQRT3 = CR.THREE.sqrt();

  private long mN = 0;

  @Override
  public Z next() {
    return SQRT3.multiply(CR.valueOf(SQRT3.multiply(++mN).floor())).floor();
  }
}

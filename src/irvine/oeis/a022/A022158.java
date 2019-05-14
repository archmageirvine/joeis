package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022158 First column of spectral array <code>W(sqrt(3))</code>.
 * @author Sean A. Irvine
 */
public class A022158 implements Sequence {

  private static final CR SQRT3 = CR.THREE.sqrt();

  private long mN = 0;

  @Override
  public Z next() {
    return SQRT3.multiply(CR.valueOf(SQRT3.multiply(CR.valueOf(++mN)).floor())).floor();
  }
}

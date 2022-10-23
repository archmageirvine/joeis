package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022847 Integer nearest n*sqrt(3).
 * @author Sean A. Irvine
 */
public class A022847 extends Sequence0 {

  private static final CR N = CR.THREE.sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(++mN).round();
  }
}

package irvine.oeis.a032;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032616 a(n) = floor(n^2/Pi).
 * @author Sean A. Irvine
 */
public class A032616 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(Z.valueOf(++mN).square()).divide(CR.PI).floor();
  }
}

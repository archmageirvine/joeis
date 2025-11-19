package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389111 Write 0,1,2,3,4,... in a triangular spiral, a(n) is such that n lies geometrically half way between 0 and a(n).
 * @author Sean A. Irvine
 */
public class A389111 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(2 * (++mN + 1)).sqrt().divide(3).round().square().multiply(9).add(2 * mN);
  }
}

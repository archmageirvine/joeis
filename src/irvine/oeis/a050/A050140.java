package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050140 a(n) = 2*floor(n*phi)-n, where phi = (1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A050140 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.PHI.multiply(++mN).floor().multiply2().subtract(mN);
  }
}

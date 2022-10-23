package irvine.oeis.a092;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A092315 a(n) is the smallest m such that the partial sum of the odd harmonic series Sum_{j=0..m} 1/(2j+1) is &gt; n.
 * @author Sean A. Irvine
 */
public class A092315 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return CR.valueOf(mN).subtract(CR.GAMMA).exp().divide(CR.FOUR).floor();
  }
}

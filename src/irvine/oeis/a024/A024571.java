package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024571 a(n) = [ sum of 1/{k*r} ] for k = 1,2,...,n, where r = (1 + sqrt(5))/2 and {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024571 extends Sequence1 {

  private long mN = 0;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(CR.PHI);
    mSum = mSum.add(s.subtract(CR.valueOf(s.floor())).inverse());
    return mSum.floor();
  }
}

package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024571 <code>a(n) = [</code> sum of <code>1/{k*r} ]</code> for k <code>= 1,2,...,n</code>, where r <code>= (1 + sqrt(5))/2</code> and <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024571 implements Sequence {

  private long mN = 0;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(CR.PHI);
    mSum = mSum.add(s.subtract(CR.valueOf(s.floor())).inverse());
    return mSum.floor();
  }
}

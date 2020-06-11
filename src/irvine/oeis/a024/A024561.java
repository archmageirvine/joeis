package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024561 <code>a(n) = [</code> sum of <code>1/{k*sqrt(6)} ]</code> for k <code>= 1,2,...,n</code>, where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024561 implements Sequence {

  private static final CR SQRT6 = CR.SIX.sqrt();
  private long mN = 0;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(SQRT6);
    mSum = mSum.add(s.subtract(CR.valueOf(s.floor())).inverse());
    return mSum.floor();
  }
}

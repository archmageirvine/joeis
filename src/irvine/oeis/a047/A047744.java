package irvine.oeis.a047;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A047744 A discrete analog of Li(n): round ( Sum_{k=2..n} 1/log_2 (k) ).
 * @author Sean A. Irvine
 */
public class A047744 extends Sequence2 {

  private static final CR LN2 = CR.TWO.log();
  private long mN = 1;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(CR.valueOf(++mN).log().inverse());
    return mSum.multiply(LN2).round();
  }
}

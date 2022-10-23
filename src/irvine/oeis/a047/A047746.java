package irvine.oeis.a047;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A047746 A discrete analog of Li(n): floor ( Sum_{k=2..n} 1/log_10 (k) ).
 * @author Sean A. Irvine
 */
public class A047746 extends Sequence2 {

  private static final CR LN10 = CR.TEN.log();
  private long mN = 1;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(CR.valueOf(++mN).log().inverse());
    return mSum.multiply(LN10).floor();
  }
}

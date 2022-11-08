package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060298 Number of powers x^y (x,y &gt; 1) with n digits.
 * @author Sean A. Irvine
 */
public class A060298 extends Sequence1 {

  private static final CR LG10 = CR.TEN.log().divide(CR.TWO.log());
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.THREE;
    }
    return Integers.SINGLETON.sum(2, LG10.multiply(mN).intValue(), y -> CR.TEN.pow(new Q(mN, y)).ceil().subtract(CR.TEN.pow(new Q(mN - 1, y)).ceil()));
  }
}

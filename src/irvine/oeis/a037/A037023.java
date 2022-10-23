package irvine.oeis.a037;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037023 Triangle in which row n has the first n digits of sqrt(n) (rounded).
 * @author Sean A. Irvine
 */
public class A037023 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private String mS = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      ++mN;
      // Somewhat evil because more than 1 digit can change as a result of rounding
      final CR s = CR.valueOf(mN).sqrt();
      final int len = s.floor().toString().length();
      mS = CR.valueOf(mN).sqrt().multiply(Z.TEN.pow(mN - len)).round().toString();
    }
    return Z.valueOf(mS.charAt(mM) - '0');
  }
}

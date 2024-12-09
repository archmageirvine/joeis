package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565 Number of Fibonacci numbers F(k), k &lt;= 10^n, whose initial digit is 9.
 * @author Sean A. Irvine
 */
public class A073565 extends Sequence1 {

  // After Jinyuan Wang

  private static final CR LOG_PHI = CR.PHI.log();
  private static final CR D = CR.LOG10.divide(LOG_PHI);
  private static final CR R = CR.FIVE.sqrt().log().divide(LOG_PHI);
  private static final CR S = CR.FIVE.subtract(CR.NINE.log().divide(LOG_PHI));
  private static final CR T = CR.FIVE.subtract(D);
  private Z mU = Z.valueOf(-3);
  private long mK = 0;
  private long mC = 0;

  @Override
  public Z next() {
    mU = mU.multiply(10).add(36);
    final CR u = CR.valueOf(mU);
    CR r;
    while ((r = R.add(D.multiply(mK))).compareTo(u) < 0) {
      final CR rf = r.frac();
      if (rf.compareTo(S) < 0 && rf.compareTo(T) > 0) {
        ++mC;
      }
      ++mK;
    }
    return Z.valueOf(mC);
  }
}

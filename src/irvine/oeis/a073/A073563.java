package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073563 Number of Fibonacci numbers F(k), k &lt;= 10^n, whose initial digit is 7.
 * @author Sean A. Irvine
 */
public class A073563 extends Sequence1 {

  // After Jinyuan Wang

  private static final CR LOG_PHI = CR.PHI.log();
  private static final CR D = CR.LOG10.divide(LOG_PHI);
  private static final CR R = CR.FIVE.sqrt().log().divide(LOG_PHI);
  private static final CR S = CR.FIVE.subtract(CR.SEVEN.log().divide(LOG_PHI));
  private static final CR T = CR.FIVE.subtract(CR.EIGHT.log().divide(LOG_PHI));
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
    final CR rd = r.subtract(D);
    final CR rdf = rd.frac();
    final long res = rdf.compareTo(S) < 0 && rdf.compareTo(T) > 0
      ? mC - 1 : mC;
    return Z.valueOf(res);
  }
}

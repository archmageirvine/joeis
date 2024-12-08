package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073561 Number of Fibonacci numbers F(k), k &lt;= 10^n, whose initial digit is 5.
 * @author Sean A. Irvine
 */
public class A073561 extends Sequence1 {

  // After Jinyuan Wang

  private static final CR LOG_PHI = CR.PHI.log();
  private static final CR D = CR.LOG10.divide(LOG_PHI);
  private static final CR R = CR.FIVE.sqrt().log().divide(LOG_PHI);
  private static final CR S = CR.FOUR.subtract(CR.FIVE.log().divide(LOG_PHI));
  private static final CR T = CR.FOUR.subtract(CR.SIX.log().divide(LOG_PHI));
  private Z mU = Z.ONE;
  private long mK = 0;
  private long mC = 1;

  @Override
  public Z next() {
    mU = mU.multiply(10);
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
    final long res = rdf.compareTo(S) < 0 && rdf.compareTo(T) > 0 && rd.add(3).compareTo(u) > 0
      ? mC - 1 : mC;
    return Z.valueOf(res);
  }
}

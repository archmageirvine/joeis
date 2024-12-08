package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073557 Number of Fibonacci numbers F(k), k &lt;= 10^n, whose initial digit is 1.
 * @author Sean A. Irvine
 */
public class A073557 extends Sequence1 {

  // After Jinyuan Wang

  private static final CR LOG_PHI = CR.PHI.log();
  private static final CR SQRT5 = CR.FIVE.sqrt();
  private static final CR D = CR.LOG10.divide(LOG_PHI);
  private static final CR R = SQRT5.log().divide(LOG_PHI);
  private static final CR S = CR.FIVE.subtract(SQRT5).log().divide(LOG_PHI);
  private Z mU = Z.ONE;
  private long mT = 0;
  private long mK = 0;

  @Override
  public Z next() {
    mU = mU.multiply(10);
    final CR u = CR.valueOf(mU);
    CR r = R;
    CR s = S;
    while (s.compareTo(u) < 0) {
      final CR d = D.multiply(++mK);
      r = R.add(d);
      s = S.add(d);
      if (r.floor().equals(s.floor())) {
        ++mT;
      } else {
        mT += 2;
      }
    }
    if (r.compareTo(u) < 0 || r.floor().equals(s.floor())) {
      return Z.valueOf(mT + 1);
    } else {
      return Z.valueOf(mT);
    }
  }
}

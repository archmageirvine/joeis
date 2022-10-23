package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038546 Numbers n such that n-th Fibonacci number has initial digits n.
 * @author Sean A. Irvine
 */
public class A038546 extends Sequence1 {

  // After Benoit Cloitre

  private static final ComputableReals R = ComputableReals.SINGLETON;
  private static final CR B = CR.FIVE.sqrt().inverse();
  private static final CR LOGB = B.log();
  private static final CR LOGPHI = CR.PHI.log();
  private static final CR LOG10 = CR.TEN.log();
  private static final Z[] SMALL = {Z.ZERO, Z.ONE, Z.FIVE};
  private int mSmall = 0;
  private long mN = 42;

  @Override
  public Z next() {
    if (mSmall < SMALL.length) {
      return SMALL[mSmall++];
    }
    while (true) {
      if (++mN == R.pow(CR.PHI, mN).multiply(B)
        .divide(R.pow(CR.TEN, LOGB.add(LOGPHI.multiply(mN)).divide(LOG10).floor().longValueExact() - CR.valueOf(mN).log().divide(LOG10).floor().longValueExact()))
        .floor().longValueExact()) {
        return Z.valueOf(mN);
      }
    }
  }
}

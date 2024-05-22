package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067698 Positive integers such that sigma(n) &gt;= exp(gamma) * n * log(log(n)).
 * @author Sean A. Irvine
 */
public class A067698 extends Sequence1 {

  private static final CR EXP_GAMMA = CR.GAMMA.exp();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final CR sigma = CR.valueOf(Functions.SIGMA1.z(++mN));
      if (sigma.compareTo(EXP_GAMMA.multiply(mN).multiply(CR.valueOf(mN).log().log())) >= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

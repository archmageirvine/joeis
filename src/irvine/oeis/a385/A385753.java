package irvine.oeis.a385;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081418.
 * @author Sean A. Irvine
 */
public class A385753 extends Sequence1 {

  private static final CR LOG_SQRT_PI = CR.SQRT_PI.log();
  private long mN = 0;

  @Override
  public Z next() {
    CR n = CR.valueOf(++mN);
    long k = n.log().divide(LOG_SQRT_PI).ceil().longValue() + 1;
    Z res = Z.ZERO;
    while (--k >= 0) {
      res = res.multiply(10);
      final Z t = n.divide(CR.SQRT_PI.pow(k)).floor();
      res = res.add(t);
      n = n.subtract(CR.SQRT_PI.pow(k).multiply(t));
    }
    return res;
  }
}

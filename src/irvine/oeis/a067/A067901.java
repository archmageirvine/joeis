package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067901 Numbers k such that floor(log(Pi)^k) is prime.
 * @author Sean A. Irvine
 */
public class A067901 extends Sequence1 {

  private static final CR LOG_PI = CR.PI.log();
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (LOG_PI.pow(++mN).floor().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

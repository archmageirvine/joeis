package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072648 a(n) = [log_{Phi}(n*sqrt(5))], where log_{Phi} is logarithm in the base Phi ( = (sqrt(5)+1)/2) and [] stands for the floor function.
 * @author Sean A. Irvine
 */
public class A072648 extends Sequence1 {

  private static final CR SQRT5 = CR.FIVE.sqrt();
  private static final CR LOG_PHI = CR.PHI.log();
  private long mN = 0;

  @Override
  public Z next() {
    return SQRT5.multiply(++mN).log().divide(LOG_PHI).floor();
  }
}

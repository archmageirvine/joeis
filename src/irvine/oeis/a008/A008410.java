package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008410 <code>a(0) = 1, a(n) =</code> 480*sigma_7(n).
 * @author Sean A. Irvine
 */
public class A008410 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Cheetah.factor(mN).sigma(7).multiply(480);
  }
}

package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078769 Numbers k such that k * phi(k)^2 &lt; sigma(k)^2.
 * @author Sean A. Irvine
 */
public class A078769 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).square().multiply(mN).compareTo(Functions.SIGMA1.z(mN).square()) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}


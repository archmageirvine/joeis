package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065522 Numbers k such that sigma(k) and sigma(k+1) are nontrivial powers (A065496).
 * @author Sean A. Irvine
 */
public class A065522 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).isPower() != null && Functions.SIGMA1.z(mN + 1).isPower() != null) {
        return Z.valueOf(mN);
      }
    }
  }
}

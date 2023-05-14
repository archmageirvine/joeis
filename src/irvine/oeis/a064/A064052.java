package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064052 Not sqrt(n)-smooth: some prime factor of n is &gt; sqrt(n).
 * @author Sean A. Irvine
 */
public class A064052 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).largestPrimeFactor().square().compareTo(mN) > 0) {
        return mN;
      }
    }
  }
}

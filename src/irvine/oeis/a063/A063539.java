package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063539 Numbers n that are sqrt(n-1)-smooth: largest prime factor of n (=A006530(n)) &lt; sqrt(n).
 * @author Sean A. Irvine
 */
public class A063539 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).largestPrimeFactor().square().longValueExact() < mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

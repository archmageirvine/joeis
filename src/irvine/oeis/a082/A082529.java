package irvine.oeis.a082;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082529 Numbers m that divide binomial(m*(m+1), m+1)/m^2.
 * @author Sean A. Irvine
 */
public class A082529 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Binomial.binomial(++mN * (mN + 1), mN, mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

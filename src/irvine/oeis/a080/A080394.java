package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080394 Numbers k such that binomial(k, floor(k/2)) is divisible by k^2.
 * @author Sean A. Irvine
 */
public class A080394 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Binomial.binomial(++mN, mN / 2, mN * mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

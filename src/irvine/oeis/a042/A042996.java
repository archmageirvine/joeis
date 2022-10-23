package irvine.oeis.a042;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A042996 Numbers k such that binomial(k, floor(k/2)) is divisible by k.
 * @author Sean A. Irvine
 */
public class A042996 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Binomial.binomial(++mN, mN / 2).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

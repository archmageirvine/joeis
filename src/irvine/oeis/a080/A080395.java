package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080395 Even numbers k such that the central binomial coefficient A000984(k, k/2) is divisible by k^2.
 * @author Sean A. Irvine
 */
public class A080395 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Binomial.binomial(mN, mN / 2, mN * mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

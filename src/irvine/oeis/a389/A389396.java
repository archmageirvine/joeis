package irvine.oeis.a389;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389396 allocated for Stijn Cambie.
 * @author Sean A. Irvine
 */
public class A389396 extends Sequence1 {

  private long mN = 207;

  @Override
  public Z next() {
    while (true) {
      if (Binomial.binomial(2 * ++mN, mN).mod(Z.valueOf(mN + 1).square().multiply(Z.valueOf(mN + 2).square())).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

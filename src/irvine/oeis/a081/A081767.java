package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081767 Numbers k such that k^2 - 1 divides binomial(2k,k).
 * @author Sean A. Irvine
 */
public class A081767 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Binomial.binomial(2 * ++mN, mN, Z.valueOf(mN).square().subtract(1)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}


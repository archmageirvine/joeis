package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081766 Numbers k such that k^2+1 divides C(2k,k).
 * @author Sean A. Irvine
 */
public class A081766 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Binomial.binomial(2 * ++mN, mN).mod(Z.valueOf(mN).square().add(1)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}


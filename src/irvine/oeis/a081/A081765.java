package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081765 Numbers k such that k+2 divides 2^(k-1) - 1.
 * @author Sean A. Irvine
 */
public class A081765 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.TWO.modPow(mN++, mN + 2).isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}


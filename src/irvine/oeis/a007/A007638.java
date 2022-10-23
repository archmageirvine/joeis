package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007638 Numbers k such that 3*k^2 - 3*k + 23 is composite.
 * @author Sean A. Irvine
 */
public class A007638 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().multiply(3).subtract(mN.multiply(3)).add(23);
      if (!p.isProbablePrime()) {
        return mN;
      }
    }
  }
}


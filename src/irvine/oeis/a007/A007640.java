package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007640 Numbers k such that 2*k^2 - 2*k + 19 is composite.
 * @author Sean A. Irvine
 */
public class A007640 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().multiply2().subtract(mN.multiply2()).add(19);
      if (!p.isProbablePrime()) {
        return mN;
      }
    }
  }
}


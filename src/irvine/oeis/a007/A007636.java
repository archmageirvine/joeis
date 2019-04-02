package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007636 Numbers k such that k^2 + k + 17 is composite.
 * @author Sean A. Irvine
 */
public class A007636 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().add(mN).add(17);
      if (!p.isProbablePrime()) {
        return mN;
      }
    }
  }
}


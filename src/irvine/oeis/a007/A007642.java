package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007642 Numbers k such that 2*k^2 +29 is composite.
 * @author Sean A. Irvine
 */
public class A007642 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().multiply2().add(29);
      if (!p.isProbablePrime()) {
        return mN;
      }
    }
  }
}


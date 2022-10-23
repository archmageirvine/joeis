package irvine.oeis.a352;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A352800 Numbers k such that 2*k^2 + 29 is prime.
 * @author Sean A. Irvine
 */
public class A352800 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().multiply2().add(29);
      if (p.isProbablePrime()) {
        return mN;
      }
    }
  }
}


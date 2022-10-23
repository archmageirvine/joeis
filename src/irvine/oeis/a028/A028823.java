package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028823 Numbers k such that k^2 + k + 17 is prime.
 * @author Sean A. Irvine
 */
public class A028823 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().add(mN).add(17);
      if (p.isProbablePrime()) {
        return mN;
      }
    }
  }
}


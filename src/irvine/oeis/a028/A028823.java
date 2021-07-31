package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028823 Numbers n such that n^2 + n + 17 is prime.
 * @author Sean A. Irvine
 */
public class A028823 implements Sequence {

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


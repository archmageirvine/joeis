package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007635 Primes of form n^2 + n + 17.
 * @author Sean A. Irvine
 */
public class A007635 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().add(mN).add(17);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}


package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005846 Primes of the form n^2 + n + 41.
 * @author Sean A. Irvine
 */
public class A005846 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z v = mN.square().add(mN).add(41);
      if (v.isProbablePrime()) {
        return v;
      }
    }
  }
}

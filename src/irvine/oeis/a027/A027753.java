package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027753 Primes of form n^2 + n + 3.
 * @author Sean A. Irvine
 */
public class A027753 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().add(mN).add(3);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}

package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002383 Primes of form k^2 + k + 1.
 * @author Sean A. Irvine
 */
public class A002383 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.add(1).multiply(mN).add(1);
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}

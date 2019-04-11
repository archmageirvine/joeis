package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002383 Primes of form <code>n^2 + n + 1</code>.
 * @author Sean A. Irvine
 */
public class A002383 implements Sequence {

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

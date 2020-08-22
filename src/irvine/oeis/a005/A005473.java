package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005473 Primes of form k^2 + 4.
 * @author Sean A. Irvine
 */
public class A005473 implements Sequence {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z plus = mN.square().add(4);
      if (plus.isProbablePrime()) {
        return plus;
      }
    }
  }
}

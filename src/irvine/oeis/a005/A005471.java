package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005471 Primes of the form m^2 + 3m + 9, where m can be positive or negative.
 * @author Sean A. Irvine
 */
public class A005471 implements Sequence {

  protected Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z plus = mN.square().add(mN.multiply(3)).add(9);
      if (plus.isProbablePrime()) {
        return plus;
      }
    }
  }
}

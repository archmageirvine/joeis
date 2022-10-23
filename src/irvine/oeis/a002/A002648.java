package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002648 A variant of the cuban primes: primes p = (x^3 - y^3 )/(x - y) where x = y + 2.
 * @author Sean A. Irvine
 */
public class A002648 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z p = mN.square().multiply(3).add(1);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}

package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;


/**
 * A002407 Cuban primes: primes which are the difference of two consecutive cubes.
 * @author Sean A. Irvine
 */
public class A002407 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.multiply(mN.add(1)).multiply(3).add(1);
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}

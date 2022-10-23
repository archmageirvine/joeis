package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028883 Primes of form n^2 - 7.
 * @author Sean A. Irvine
 */
public class A028883 extends Sequence1 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().subtract(7);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}

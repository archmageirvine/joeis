package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007637 Primes of form 3n^2-3n+23.
 * @author Sean A. Irvine
 */
public class A007637 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().multiply(3).subtract(mN.multiply(3)).add(23);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}


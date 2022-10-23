package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002822 Numbers m such that 6m-1, 6m+1 are twin primes.
 * @author Sean A. Irvine
 */
public class A002822 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.multiply(6);
      if (m.subtract(1).isProbablePrime() && m.add(1).isProbablePrime()) {
        return mN;
      }
    }
  }
}

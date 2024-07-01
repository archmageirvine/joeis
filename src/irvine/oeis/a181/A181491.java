package irvine.oeis.a181;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A181491 Primes of the form p = 3*2^k - 1 such that p+2 is also prime.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A181491 extends Sequence1 {

  private Z mT = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply2();
      if (mT.subtract(1).isProbablePrime() && mT.add(1).isProbablePrime()) {
        return mT.subtract(1);
      }
    }
  }
}

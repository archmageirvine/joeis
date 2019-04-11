package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002822 Numbers n such that <code>6n-1, 6n+1</code> are twin primes.
 * @author Sean A. Irvine
 */
public class A002822 implements Sequence {

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

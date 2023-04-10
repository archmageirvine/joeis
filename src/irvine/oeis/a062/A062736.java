package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062736 Primes of form Sum_{k=1..n} (prime(k)+1).
 * @author Sean A. Irvine
 */
public class A062736 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(super.next().add(1));
      if (mSum.isProbablePrime()) {
        return mSum;
      }
    }
  }
}

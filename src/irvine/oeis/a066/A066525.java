package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066525 Primes of form Sum_{k=1..n} prime(k)^3.
 * @author Sean A. Irvine
 */
public class A066525 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(super.next().pow(3));
      if (mSum.isProbablePrime()) {
        return mSum;
      }
    }
  }
}

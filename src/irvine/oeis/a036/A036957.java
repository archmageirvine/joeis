package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036957 Primes with digits (0,...,4) taken as base 5 and converted to base 10.
 * @author Sean A. Irvine
 */
public class A036957 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(Long.toString(++mN, 5)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

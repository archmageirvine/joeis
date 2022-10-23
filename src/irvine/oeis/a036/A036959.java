package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036959 Primes with digits (0,...,5) taken as base 6 and converted to base 10.
 * @author Sean A. Irvine
 */
public class A036959 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.TWO;
    }
    while (true) {
      mN += 2;
      if (new Z(Long.toString(mN, 6)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

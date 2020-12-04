package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036963 Primes with digits (0,...,7) taken as base 8 and converted to base 10.
 * @author Sean A. Irvine
 */
public class A036963 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.TWO;
    }
    while (true) {
      mN += 2;
      if (new Z(Long.toString(mN, 8)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

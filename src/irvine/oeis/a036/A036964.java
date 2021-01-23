package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036964 Primes with digits (0,...,8) taken as base 9 and converted to base 10.
 * @author Sean A. Irvine
 */
public class A036964 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(Long.toString(++mN, 9)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

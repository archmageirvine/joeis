package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036954 Primes with digits in {0,1,2} taken as base 3 and converted to base 10.
 * @author Sean A. Irvine
 */
public class A036954 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (new Z(Long.toString(++mN, 3)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

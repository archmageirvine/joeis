package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036962 Primes without {8, 9} as digits.
 * @author Sean A. Irvine
 */
public class A036962 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.TWO;
    }
    while (true) {
      mN += 2;
      final Z t = new Z(Long.toString(mN, 8));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

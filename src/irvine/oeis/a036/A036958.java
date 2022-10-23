package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036958 Primes containing only digits from the set (0,1,2,3,4,5).
 * @author Sean A. Irvine
 */
public class A036958 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.TWO;
    }
    while (true) {
      mN += 2;
      final Z t = new Z(Long.toString(mN, 6));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

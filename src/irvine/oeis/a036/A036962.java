package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036962 Primes containing only digits from the set (0,1,2,3,4,5,6,7).
 * @author Sean A. Irvine
 */
public class A036962 implements Sequence {

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

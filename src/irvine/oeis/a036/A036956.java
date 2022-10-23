package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036956 Primes containing only digits from the set (0,1,2,3,4).
 * @author Sean A. Irvine
 */
public class A036956 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z(Long.toString(++mN, 5));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

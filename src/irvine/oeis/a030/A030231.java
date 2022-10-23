package irvine.oeis.a030;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030231 Number of distinct primes dividing n is even.
 * @author Sean A. Irvine
 */
public class A030231 extends Sequence1 {

  private long mN = 0;
  
  @Override
  public Z next() {
    while (true) {
      if ((Jaguar.factor(++mN).omega() & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

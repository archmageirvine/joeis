package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030231 Number of distinct primes dividing n is even.
 * @author Sean A. Irvine
 */
public class A030231 implements Sequence {

  private long mN = 0;
  
  @Override
  public Z next() {
    while (true) {
      if ((Cheetah.factor(++mN).omega() & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

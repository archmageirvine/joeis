package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075592 Numbers n such that number of distinct prime divisors of n is a divisor of n.
 * @author Sean A. Irvine
 */
public class A075592 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN % Functions.OMEGA.l(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}


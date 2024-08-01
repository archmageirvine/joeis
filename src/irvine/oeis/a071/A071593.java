package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071593 Number of 1's in binary representation of n equals tau(n), the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A071593 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Long.bitCount(++mN) == Functions.SIGMA0.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}


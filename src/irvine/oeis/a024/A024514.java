package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a004.A004431;

/**
 * A024514 Positions of primes in <code>A004431</code> (sums of 2 distinct nonzero squares).
 * @author Sean A. Irvine
 */
public class A024514 extends A004431 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}


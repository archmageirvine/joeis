package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000404;

/**
 * A024520 Positions of primes in <code>A000404</code> (sums of 2 nonzero squares).
 * @author Sean A. Irvine
 */
public class A024520 extends A000404 {

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


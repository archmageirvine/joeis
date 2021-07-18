package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049036 Mean gap between successive primes up to n-th prime is an integer.
 * @author Sean A. Irvine
 */
public class A049036 extends A000040 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().subtract(2).mod(++mN) == 0) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}

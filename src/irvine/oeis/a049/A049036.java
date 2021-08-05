package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A049036 Mean gap between successive primes up to n-th prime is an integer.
 * @author Sean A. Irvine
 */
public class A049036 extends A065091 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().subtract(2).mod(++mN) == 0) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}

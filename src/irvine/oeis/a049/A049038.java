package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A049038 Primes arising in A049036.
 * @author Sean A. Irvine
 */
public class A049038 extends A065091 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.subtract(2).mod(++mN) == 0) {
        return p;
      }
    }
  }
}

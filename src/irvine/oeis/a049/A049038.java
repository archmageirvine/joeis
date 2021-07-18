package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049038 Primes arising in A049036.
 * @author Sean A. Irvine
 */
public class A049038 extends A000040 {

  private long mN = 0;
  {
    super.next();
  }

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

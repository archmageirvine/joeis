package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A063999 Numbers k such that the number of primes &lt;= k is phi(phi(k)).
 * @author Sean A. Irvine
 */
public class A063999 extends A000720 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Functions.PHI.z(Functions.PHI.z(++mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

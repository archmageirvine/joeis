package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A064427 a(n) = n + (number of primes &lt; n).
 * @author Sean A. Irvine
 */
public class A064427 extends A000720 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else {
      return super.next().add(mN);
    }
  }
}

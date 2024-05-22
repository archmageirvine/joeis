package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067810 Composite n such that sigma(2*n) &lt; prime(n).
 * @author Sean A. Irvine
 */
public class A067810 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!mPrime.isPrime(++mN) && Functions.SIGMA1.z(2 * mN).compareTo(p) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

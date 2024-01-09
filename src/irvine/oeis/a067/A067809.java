package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067809 Composite n such that sigma(3*n) &lt; prime(n).
 * @author Sean A. Irvine
 */
public class A067809 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!mPrime.isPrime(++mN) && Jaguar.factor(3 * mN).sigma().compareTo(p) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

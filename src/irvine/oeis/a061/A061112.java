package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061112 a(n) is the minimum number of divisors for any composite between prime(n) and prime(n+1).
 * @author Sean A. Irvine
 */
public class A061112 extends A000040 {

  {
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    Z t = super.next().add(1);
    Z min = Functions.SIGMA0.z(t);
    while (true) {
      t = t.add(1);
      if (mPrime.isPrime(t)) {
        return min;
      }
      min = min.min(Functions.SIGMA0.z(t));
    }
  }
}

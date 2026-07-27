package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086125 Values of k such that f(k) is a prime, where f(1) = 1, f(i) = prime(i)*f(i-1) + 2.
 * @author Sean A. Irvine
 */
public class A086125 extends A000040 {

  private long mK = 1;
  private Z mA = super.next().subtract(1); // == 1

  @Override
  public Z next() {
    do {
      ++mK;
      mA = mA.multiply(super.next()).add(2);
    } while (!mA.isProbablePrime());
    return Z.valueOf(mK);
  }
}


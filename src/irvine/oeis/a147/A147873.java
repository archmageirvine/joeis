package irvine.oeis.a147;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A147873 a(n) = 1 - digitsum(17982 * Sum_{k=0..7} prime(n+k)) mod 2.
 * @author Sean A. Irvine
 */
public class A147873 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z sum = p;
    Z q = p;
    for (long k = 1; k <= 7; ++k) {
      q = mPrime.nextPrime(q);
      sum = sum.add(q);
    }
    return Z.ONE.subtract(Functions.DIGIT_SUM.z(sum.multiply(17982)).mod(2));
  }
}

package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085298 a(n) is the smallest exponent x such that prime(n)^x when reversed is a prime.
 * @author Sean A. Irvine
 */
public class A085298 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z q = p;
    long k = 1;
    while (!Functions.REVERSE.z(q).isProbablePrime()) {
      q = q.multiply(p);
      ++k;
    }
    return Z.valueOf(k);
  }
}

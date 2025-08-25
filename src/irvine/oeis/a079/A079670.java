package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a080.A080050;

/**
 * A079670 a(n) = (gcd(2^p-1, Fibonacci(p))-1)/(8p) &gt; 0 where p = n-th prime from A080050.
 * @author Sean A. Irvine
 */
public class A079670 extends A080050 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Z.ONE.shiftLeft(p.longValueExact()).subtract(1).gcd(Functions.FIBONACCI.z(p)).subtract(1).divide(p).divide(8);
  }
}


package irvine.oeis.a074;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074806 Least k such that F(k) reduced (mod prime(n)) = prime(n)-1 where F(k) is the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A074806 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long k = 0;
    while (true) {
      if (Fibonacci.fibonacci(++k, p) == p - 1) {
        return Z.valueOf(k);
      }
    }
  }
}

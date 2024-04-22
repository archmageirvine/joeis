package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A068136 First Fibonacci number beginning with concatenation of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A068136 extends A007908 {

  @Override
  public Z next() {
    final Z c = super.next();
    if (Fibonacci.inverseFibonacci(c) >= 0) {
      return c;
    }
    Z lo = c;
    Z hi = c;
    while (true) {
      lo = lo.multiply(10);
      hi = hi.multiply(10).add(9);
      final int i = Fibonacci.inverseFibonacci(lo);
      if (i >= 0) {
        return lo;
      }
      final long n = -i;
      final Z t1 = Functions.FIBONACCI.z(n);
      if (t1.compareTo(lo) > 0 && t1.compareTo(hi) <= 0) {
        return t1;
      }
      final Z t2 = Functions.FIBONACCI.z((long) (1 - i));
      if (t2.compareTo(hi) <= 0) {
        return t2;
      }
    }
  }
}

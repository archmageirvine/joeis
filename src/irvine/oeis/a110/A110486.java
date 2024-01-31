package irvine.oeis.a110;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A110486 Indices of Fibonacci numbers in A068136(n); that is, a(n) = least k such that the digits of Fibonacci(k) begin with the concatenation 1234..n.
 * @author Sean A. Irvine
 */
public class A110486 extends A007908 {

  @Override
  public Z next() {
    final Z c = super.next();
    final int index = Fibonacci.inverseFibonacci(c);
    if (index >= 0) {
      return Z.valueOf(index);
    }
    Z lo = c;
    Z hi = c;
    while (true) {
      lo = lo.multiply(10);
      hi = hi.multiply(10).add(9);
      final int i = Fibonacci.inverseFibonacci(lo);
      if (i >= 0) {
        return Z.valueOf(i);
      }
      final Z t1 = Fibonacci.fibonacci(-i);
      if (t1.compareTo(lo) > 0 && t1.compareTo(hi) <= 0) {
        return Z.valueOf(-i);
      }
      final Z t2 = Fibonacci.fibonacci(1 - i);
      if (t2.compareTo(hi) <= 0) {
        return Z.valueOf(1 - i);
      }
    }
  }
}

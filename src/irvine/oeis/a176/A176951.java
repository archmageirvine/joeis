package irvine.oeis.a176;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A176951 Let p = prime(n). Then a(n) = Fibonacci(p+1)/p if this is integer, otherwise a(n) = Fibonacci(p-1)/p if this is integer, and fall back to a(n)=0 if both are non-integer.
 * otherwise a(n) = Fibonacci(p-1)/p if this is integer,
 * and fall back to a(n)=0 if both are non-integer.
 * @author Georg Fischer
 */
public class A176951 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final int ip = p.intValue();
    Z an = Functions.FIBONACCI.z(ip + 1);
    if (an.mod(p).isZero()) {
      return an.divide(ip);
    }
    an = Functions.FIBONACCI.z(ip - 1);
    if (an.mod(p).isZero()) {
      return an.divide(ip);
    }
    return Z.ZERO;
  }
}

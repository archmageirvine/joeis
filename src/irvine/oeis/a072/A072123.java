package irvine.oeis.a072;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072123 Remainder when Fibonacci(n) is divided by prime(n).
 * @author Sean A. Irvine
 */
public class A072123 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Fibonacci.fibonacci(++mN, super.next().longValueExact()));
  }
}

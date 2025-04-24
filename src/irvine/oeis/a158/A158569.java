package irvine.oeis.a158;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A158569 a(n) = Sum_{i=1..F(n)} F(i), where F = A000045, Fibonacci numbers.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A158569 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(Functions.FIBONACCI.z(++mN).add(2)).subtract(1);
  }
}

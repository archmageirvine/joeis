package irvine.oeis.a185;
// manually knest at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000201;

/**
 * A185381 a(n) = Fibonacci(k) where k = floor( n*(1+sqrt(5))/2 ).
 * @author Georg Fischer
 */
public class A185381 extends Sequence0 {

  private final A000201 mSeq = new A000201();
  private int mN = -1;

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : Functions.FIBONACCI.z(mSeq.next());
  }
}

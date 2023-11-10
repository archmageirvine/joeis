package irvine.oeis.a076;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A076776 a(0) = 1, a(1) = 2, a(2) = 5; for n &gt; 2, a(n) = a(n-1)*a(n-2).
 * @author Georg Fischer
 */
public class A076776 extends LambdaSequence {

  /** Construct the sequence. */
  public A076776() {
    super(0, n -> (n < 2) ? Z.valueOf(n + 1) : Z.TWO.pow(Fibonacci.fibonacci(n - 2)).multiply(Z.FIVE.pow(Fibonacci.fibonacci(n - 1))));
  }
}

package irvine.oeis.a351;

import irvine.math.z.Fibonacci;
import irvine.oeis.MultiplicativeSequence;

/**
 * A351219 Multiplicative with a(p^e) = Fibonacci(e+1).
 * @author Georg Fischer
 */
public class A351219 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A351219() {
    super(1, (p, e) -> Fibonacci.fibonacci(e + 1));
  }

}

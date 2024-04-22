package irvine.oeis.a351;

import irvine.math.function.Functions;
import irvine.oeis.MultiplicativeSequence;

/**
 * A351219 Multiplicative with a(p^e) = Fibonacci(e+1).
 * @author Georg Fischer
 */
public class A351219 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A351219() {
    super(1, (p, e) -> {
      return Functions.FIBONACCI.z((long) (e + 1));
    });
  }

}

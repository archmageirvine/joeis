package irvine.oeis.a176;
// Generated by gen_seq4.pl 2023-12-08/tuptraf at 2023-12-08 18:44

import irvine.math.function.Functions;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A176343 a(n) = Fibonacci(n)*a(n-1) + 1, a(0) = 0.
 * @author Georg Fischer
 */
public class A176343 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A176343() {
    super(0, (n, s) -> s[0].multiply(Functions.FIBONACCI.z(n)).add(1), "0,1", PREVIOUS, PREVIOUS);
  }
}

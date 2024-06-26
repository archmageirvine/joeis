package irvine.oeis.a111;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a001.A001591;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A111433 Fibonacci(pentanacci(n)).
 * @author Georg Fischer
 */
public class A111433 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A111433() {
    super(0, (term, n) -> Functions.FIBONACCI.z(term), "", new A001591());
  }
}

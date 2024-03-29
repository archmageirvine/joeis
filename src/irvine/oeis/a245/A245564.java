package irvine.oeis.a245;
// Generated by gen_seq4.pl rultraf at 2024-01-19 09:13

import irvine.oeis.a000.A000045;
import irvine.oeis.transform.RunLengthTransformSequence;

/**
 * A245564 a(n) = Product_{i in row n of A245562} Fibonacci(i+2).
 * @author Georg Fischer
 */
public class A245564 extends RunLengthTransformSequence {

  /** Construct the sequence. */
  public A245564() {
    super(0, new A000045().skip(2));
  }
}

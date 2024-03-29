package irvine.oeis.a320;
// Generated by gen_seq4.pl 2024-02-28/tuptraf at 2024-02-28 22:56

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A320015 Number of proper divisors of n that are either of the form 6*k+1 or 6*k + 5.
 * @author Georg Fischer
 */
public class A320015 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A320015() {
    super(1, (n, s) -> s[0].add(s[1]), "", new A320001(), new A320005());
  }
}

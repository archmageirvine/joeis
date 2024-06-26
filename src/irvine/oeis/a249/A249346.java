package irvine.oeis.a249;
// Generated by gen_seq4.pl 2024-03-30/tuptraf at 2024-03-30 20:29

import irvine.oeis.a187.A187059;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A249346 The exponent of the highest power of 6 dividing the product of the elements on the n-th row of Pascal's triangle.
 * @author Georg Fischer
 */
public class A249346 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A249346() {
    super(0, (n, s) -> s[0].min(s[1]), "", new A187059(), new A249343());
  }
}

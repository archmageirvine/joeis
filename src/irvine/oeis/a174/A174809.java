package irvine.oeis.a174;
// Generated by gen_seq4.pl 2023-10-27/tuptraf at 2023-10-27 00:00

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A174809 A (100,-196) Somos 4 sequence.
 * @author Georg Fischer
 */
public class A174809 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A174809() {
    super(0, (n, s) -> s[0].multiply(s[2]).multiply(100).subtract(s[1].square().multiply(196)).divide(s[3]), "1, 4, 68, 3664", PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS);
  }
}

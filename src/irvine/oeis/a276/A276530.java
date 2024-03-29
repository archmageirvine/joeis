package irvine.oeis.a276;
// Generated by gen_seq4.pl 2023-12-03/tuptraf at 2023-12-03 21:34

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A276530 a(n) = (a(n-1) * a(n-5) + a(n-3)^3) / a(n-6), a(0) = a(1) = ... = a(5) = 1.
 * @author Georg Fischer
 */
public class A276530 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A276530() {
    super(0, (n, s) -> s[0].multiply(s[4]).add(s[2].pow(3)).divide(s[5]), "1, 1, 1, 1, 1, 1", PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS);
  }
}

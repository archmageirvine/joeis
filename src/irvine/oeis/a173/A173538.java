package irvine.oeis.a173;
// Generated by gen_seq4.pl 2024-04-10/tuptraf at 2024-04-10 22:07

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A173538 a(n) = a(n-1) + a(n-2) - [a(n-2)/4] - [a(n-3)/2] - [a(n-4)/4].
 * @author Georg Fischer
 */
public class A173538 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A173538() {
    super(0, (n, s) -> s[0].add(s[1]).subtract(s[1].divide(4)).subtract(s[2].divide(2)).subtract(s[3].divide(4)), "1, 1, 2, 3", PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS);
  }
}

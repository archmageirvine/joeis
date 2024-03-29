package irvine.oeis.a214;
// Generated by gen_seq4.pl 2023-12-07/tuptraf at 2023-12-07 22:55

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A214551 Reed Kelly's sequence: a(n) = (a(n-1) + a(n-3))/gcd(a(n-1), a(n-3)) with a(0) = a(1) = a(2) = 1.
 * @author Georg Fischer
 */
public class A214551 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A214551() {
    super(0, (n, s) -> s[0].add(s[2]).divide(s[0].gcd(s[2])), "1, 1, 1", PREVIOUS, PREVIOUS, PREVIOUS);
  }
}

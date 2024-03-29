package irvine.oeis.a286;
// Generated by gen_seq4.pl pairing/tuptraf at 2023-10-26 20:56

import irvine.oeis.a017.A017666;
import irvine.oeis.a046.A046523;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A286571 Compound filter (prime signature of n &amp; n/gcd(n, sigma(n))): a(n) = P(A046523(n), A017666(n)), where P(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A286571 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A286571() {
    super(1, PAIR, "", new A046523(), new A017666());
  }
}

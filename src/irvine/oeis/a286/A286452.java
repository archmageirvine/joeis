package irvine.oeis.a286;
// Generated by gen_seq4.pl pairing/tuptraf at 2023-10-26 20:56

import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046523;
import irvine.oeis.a061.A061395;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A286452 Compound filter (largest prime factor of n &amp; prime signature of 2n-1): a(n) = P(A061395(n), A046523(2n-1)), where P(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A286452 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A286452() {
    super(1, PAIR, "", new A061395(), new FilterSequence(1, new A046523(), (n, v) -> (n & 1) == 1));
  }
}

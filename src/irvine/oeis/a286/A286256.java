package irvine.oeis.a286;
// Generated by gen_seq4.pl pairing/tuptraf at 2023-10-26 20:56

import irvine.oeis.a046.A046523;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A286256 Compound filter: a(n) = P(A046523(n), A046523(2+n)), where P(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A286256 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A286256() {
    super(1, PAIR, "", new A046523(), new A046523().skip(2));
  }
}

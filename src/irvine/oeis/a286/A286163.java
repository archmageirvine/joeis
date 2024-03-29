package irvine.oeis.a286;
// Generated by gen_seq4.pl pairing/tuptraf at 2023-10-26 20:56

import irvine.oeis.a046.A046523;
import irvine.oeis.a278.A278222;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A286163 Compound filter: a(n) = T(A046523(n), A278222(n)), where T(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A286163 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A286163() {
    super(1, PAIR, "", new A046523(), new A278222().skip(1));
  }
}

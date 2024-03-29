package irvine.oeis.a286;
// Generated by gen_seq4.pl pairing/tuptraf at 2023-10-26 20:56

import irvine.oeis.a046.A046523;
import irvine.oeis.a051.A051953;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A286152 Compound filter: a(n) = T(A051953(n), A046523(n)), where T(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A286152 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A286152() {
    super(1, PAIR, "", new A051953(), new A046523());
  }
}

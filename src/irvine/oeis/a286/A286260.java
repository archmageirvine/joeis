package irvine.oeis.a286;
// Generated by gen_seq4.pl pairing/tuptraf at 2023-10-26 20:56

import irvine.oeis.a001.A001511;
import irvine.oeis.a161.A161942;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A286260 Compound filter: a(n) = P(A001511(n), A161942(n)), where P(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A286260 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A286260() {
    super(1, PAIR, "", new A001511(), new A161942());
  }
}

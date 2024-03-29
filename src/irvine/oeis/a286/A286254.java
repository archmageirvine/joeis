package irvine.oeis.a286;
// Generated by gen_seq4.pl pairing/tuptraf at 2023-10-26 20:56

import irvine.oeis.a001.A001511;
import irvine.oeis.a055.A055396;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A286254 Compound filter: a(n) = P(A001511(n), A055396(1+n)), where P(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A286254 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A286254() {
    super(1, PAIR, "", new A001511(), new A055396().skip(1));
  }
}

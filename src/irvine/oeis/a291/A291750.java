package irvine.oeis.a291;
// Generated by gen_seq4.pl pairing/tuptraf at 2023-10-26 20:56

import irvine.oeis.a003.A003557;
import irvine.oeis.a048.A048250;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A291750 Compound filter: a(n) = P(A003557(n), A048250(n)), where P(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A291750 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A291750() {
    super(1, PAIR, "", new A003557(), new A048250());
  }
}

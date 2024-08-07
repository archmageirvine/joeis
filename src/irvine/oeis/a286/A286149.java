package irvine.oeis.a286;
// Generated by gen_seq4.pl 2024-08-01.ack/pairtr at 2024-08-01 22:21

import irvine.oeis.a046.A046523;
import irvine.oeis.a109.A109395;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A286149 Compound filter: a(n) = T(A046523(n), A109395(n)), where T(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A286149 extends PairTransformSequence {

  /** Construct the sequence. */
  public A286149() {
    super(1, new A046523(), new A109395());
  }
}

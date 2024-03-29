package irvine.oeis.a289;
// Generated by gen_seq4.pl pairing/tuptraf at 2023-10-26 20:56

import irvine.oeis.a002.A002322;
import irvine.oeis.a046.A046523;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A289622 Compound filter (prime signature &amp; Carmichael's lambda): a(n) = P(A046523(n), A002322(n)), where P(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A289622 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A289622() {
    super(1, PAIR, "", new A046523(), new A002322());
  }
}

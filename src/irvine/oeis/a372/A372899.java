package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-05-26.ack/filtpos at 2025-05-26 23:11

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002203;

/**
 * A372899 Numbers k that divide the k-th companion Pell number.
 * @author Georg Fischer
 */
public class A372899 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A372899() {
    super(1, 1, new A002203().skip(1), (k, v) -> v.mod(k) == 0);
  }
}

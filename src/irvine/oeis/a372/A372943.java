package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-05-26.ack/filtpos at 2025-05-26 23:11

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a005.A005258;

/**
 * A372943 Numbers k that divide the k-th Ap\u00e9ry number (A005258).
 * @author Georg Fischer
 */
public class A372943 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A372943() {
    super(1, 1, new A005258().skip(1), (k, v) -> v.mod(k) == 0);
  }
}

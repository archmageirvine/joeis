package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-05-26.ack/filtpos at 2025-05-26 23:11

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002895;

/**
 * A372941 Numbers k that divide the k-th Domb number.
 * @author Georg Fischer
 */
public class A372941 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A372941() {
    super(1, 1, new A002895().skip(1), (k, v) -> v.mod(k) == 0);
  }
}

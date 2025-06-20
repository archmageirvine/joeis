package irvine.oeis.a088;
// Generated by gen_seq4.pl 2025-06-15.ack/filtpos at 2025-06-15 21:33

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a354.A354099;

/**
 * A088232 Numbers k such that 3 does not divide phi(k).
 * @author Georg Fischer
 */
public class A088232 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A088232() {
    super(1, 1, new A354099(), ZERO);
  }
}

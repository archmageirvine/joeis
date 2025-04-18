package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-01-31.ack/ordtraf at 2025-01-31 23:19

import irvine.oeis.a355.A355582;
import irvine.oeis.transform.OrdinalTransformSequence;

/**
 * A379006 Ordinal transform of A355582, where A355582 is the largest 5-smooth divisor of n.
 * @author Georg Fischer
 */
public class A379006 extends OrdinalTransformSequence {

  /** Construct the sequence. */
  public A379006() {
    super(1, new A355582());
  }
}


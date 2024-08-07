package irvine.oeis.a129;
// Generated by gen_seq4.pl 2024-07-24.ack/multraf at 2024-07-24 22:30

import irvine.oeis.a000.A000272;
import irvine.oeis.a057.A057500;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A129271 Number of labeled n-node connected graphs with at most one cycle.
 * @author Georg Fischer
 */
public class A129271 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A129271() {
    super(0, (self, n) -> self.s(0).add(self.s(1)), "1", new A000272(), new A057500());
  }
}

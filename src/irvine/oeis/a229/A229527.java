package irvine.oeis.a229;
// Generated by gen_seq4.pl 2025-07-06.ack/multia at 2025-07-06 20:53

import irvine.math.function.Functions;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A229527 Start with 1, skip (sum of digits of n) numbers, accept next number.
 * @author Georg Fischer
 */
public class A229527 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A229527() {
    super(1, (self, n) -> self.a(n - 1).add(Functions.DIGIT_SUM.z(self.a(n - 1))).add(1), "");
  }
}

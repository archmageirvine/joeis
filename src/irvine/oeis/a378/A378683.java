package irvine.oeis.a378;
// Generated by gen_seq4.pl 2024-12-30.ack/multrar at 2024-12-30 19:33

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A378683 a(0) = 1, a(n+1) = 6*a(n)^3 - 3*a(n).
 * @author Georg Fischer
 */
public class A378683 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A378683() {
    super(0, (self, n) -> self.a(n - 1).pow(3).multiply(6).subtract(self.a(n - 1).multiply(3)), "1");
  }
}

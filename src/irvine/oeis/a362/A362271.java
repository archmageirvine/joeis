package irvine.oeis.a362;
// Generated by gen_seq4.pl 2025-04-08.ack/multrar at 2025-04-08 00:02

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A362271 a(1) = 1, then add, subtract and multiply 2, 3, 4; 5, 6, 7; ... in that order.
 * @author Georg Fischer
 */
public class A362271 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A362271() {
    super(1, (self, n) -> n % 3 == 2 ? self.a(n - 1).add(n) : (n % 3 == 0 ? self.a(n - 1).subtract(n) : self.a(n - 1).multiply(n)), "1");
  }
}

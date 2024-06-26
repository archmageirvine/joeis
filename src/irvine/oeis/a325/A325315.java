package irvine.oeis.a325;
// Generated by gen_seq4.pl 2024-07-01/multraf at 2024-07-01 18:26

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A325315 Bitwise-XOR of absolute values of (n - A048250(n)) and (n - A162296(n)).
 * @author Georg Fischer
 */
public class A325315 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A325315() {
    super(1, (self, n) -> self.s(0).abs().xor(self.s(1).abs()), "", new A325313(), new A325314());
  }
}

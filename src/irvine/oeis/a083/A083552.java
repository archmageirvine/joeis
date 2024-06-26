package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-04-22/multraf at 2024-04-22 22:28

import irvine.oeis.a057.A057467;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A083552 Quotient when LCM of 2 consecutive prime differences is divided by GCD of the same two differences.
 * @author Georg Fischer
 */
public class A083552 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A083552() {
    super(1, (self, n) -> self.s(0).divide(self.s(1)), "2", new A083551(), new A057467());
  }
}

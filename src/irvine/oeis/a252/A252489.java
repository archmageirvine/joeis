package irvine.oeis.a252;
// Generated by gen_seq4.pl 2024-04-22/multraf at 2024-04-22 22:28

import irvine.oeis.a061.A061395;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A252489 Index of the largest prime which divides n*(n+1).
 * @author Georg Fischer
 */
public class A252489 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A252489() {
    super(1, (self, n) -> self.s(0).max(self.s(1)), "", new A061395().skip(1), PREVIOUS);
  }
}

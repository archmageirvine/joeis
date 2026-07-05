package irvine.oeis.a333;
// manually 2026-07-05/multraf at 2026-07-05 10:03

import irvine.oeis.a000.A000002;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A333229 First sums of the Kolakoski sequence A000002.
 * @author Georg Fischer
 */
public class A333229 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A333229() {
    super(1, (self, n) -> self.s(0).add(self.s(1)), "", new A000002(), PREVIOUS);
    next();
  }
}

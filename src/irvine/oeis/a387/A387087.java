package irvine.oeis.a387;
// manually robots/multraf at 2025-10-29 12:29

import irvine.oeis.a386.A386482;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A387087 GCD of pairs of consecutive terms of the sequence A386482.
 * @author Georg Fischer
 */
public class A387087 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A387087() {
    super(1, (self, n) -> self.s(0).gcd(self.s(1)), "", new A386482(), PREVIOUS);
    next();
  }
}

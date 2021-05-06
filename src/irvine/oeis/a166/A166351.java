package irvine.oeis.a166;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A166351 a(n) = (6*n)!/(3*n)!.
 * @author Georg Fischer
 */
public class A166351 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A166351() {
    super(0, "[[0],[-240, 3288,-16200, 36720,-38880, 15552],[-2, 9,-9]]", "[1]", 0);
  }
}

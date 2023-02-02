package irvine.oeis.a200;
// manually etman at 2023-02-01 22:30

import irvine.oeis.ConstantFactorSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.transform.EulerTransform;

/**
 * A200751 Expansion of (1 - x) * (1 - x^2)^2 * (1 - x^3)^4 * ... in powers of x.
 * @author Georg Fischer
 */
public class A200751 extends EulerTransform {

  /** Construct the sequence. */
  public A200751() {
    super(0, new ConstantFactorSequence(new A000079(), -1, 1), 1);
  }
}

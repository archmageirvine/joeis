package irvine.oeis.a104;
// manually etman at 2023-02-01 22:30

import irvine.oeis.ConstantFactorSequence;
import irvine.oeis.a008.A008965;
import irvine.oeis.transform.EulerTransform;

/**
 * A104575 Alternating sum of diagonals in A060177.
 * @author Georg Fischer
 */
public class A104575 extends EulerTransform {

  /** Construct the sequence. */
  public A104575() {
    super(0, new ConstantFactorSequence(new A008965(), -1, 1), 1);
  }
}

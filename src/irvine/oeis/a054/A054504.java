package irvine.oeis.a054;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a081.A081119;

/**
 * A054504 Numbers n such that Mordell's equation y^2 = x^3 + n has no integral solutions.
 * @author Sean A. Irvine
 */
public class A054504 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A054504() {
    super(1, new A081119(), 0);
  }
}

package irvine.oeis.a081;

import irvine.oeis.Conjectural;
import irvine.oeis.FilterPositionSequence;

/**
 * A081121 Numbers k such that Mordell's equation y^2 = x^3 - k has no integral solutions.
 * @author Sean A. Irvine
 */
public class A081121 extends FilterPositionSequence implements Conjectural {

  /** Construct the sequence. */
  public A081121() {
    super(1, new A081120(), ZERO);
  }
}

package irvine.oeis.a046;

import irvine.oeis.PositionSequence;

/**
 * A046696 Nim-value of 0 for Couples-are-Forever occurs for these heap sizes.
 * @author Sean A. Irvine
 */
public class A046696 extends PositionSequence {

  /** Construct the sequence. */
  public A046696() {
    super(1, new A046695(), 0);
  }
}

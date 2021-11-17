package irvine.oeis.a067;
// manually posins at 2021-11-16

import irvine.oeis.PositionSequence;
import irvine.oeis.a191.A191255;

/**
 * A067368 a(n) is the smallest positive even integer that cannot be expressed as the product of two or three previous terms (not necessarily distinct).
 * Positions of 1 in A191255.
 * @author Georg Fischer
 */
public class A067368 extends PositionSequence {

  /** Construct the sequence. */
  public A067368() {
    super(1, new A191255(), 1);
  }
}

package irvine.oeis.a083;

import irvine.oeis.FixedPointPositionSequence;
import irvine.oeis.a069.A069770;

/**
 * A083938 A014486-indices of binary trees whose left and right subtree are identical.
 * @author Sean A. Irvine
 */
public class A083938 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A083938() {
    super(0, new A069770());
  }
}

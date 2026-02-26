package irvine.oeis.a083;

import irvine.oeis.FixedPointPositionSequence;
import irvine.oeis.a057.A057163;

/**
 * A083940 A014486-indices of symmetric binary trees.
 * @author Sean A. Irvine
 */
public class A083940 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A083940() {
    super(0, new A057163());
  }
}

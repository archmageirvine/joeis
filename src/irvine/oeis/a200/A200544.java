package irvine.oeis.a200;
// manually etman at 2023-02-01 22:30

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.transform.EulerTransform;

/**
 * A200544 Number of distinct bags of distinct sequences of 1s and 2s such that the sum of all terms is n.
 * @author Georg Fischer
 */
public class A200544 extends EulerTransform {

  /** Construct the sequence. */
  public A200544() {
    super(0, new SkipSequence(new A000045(), 2), 1);
  }
}

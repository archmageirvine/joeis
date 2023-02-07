package irvine.oeis.a290;
// manually etman at 2023-02-06 12:43

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000110;
import irvine.oeis.transform.EulerTransform;

/**
 * A290351 Euler transform of the Bell numbers (A000110).
 * @author Georg Fischer
 */
public class A290351 extends EulerTransform {

  /** Construct the sequence. */
  public A290351() {
    super(0, new SkipSequence(new A000110(), 1), 1);
  }
}

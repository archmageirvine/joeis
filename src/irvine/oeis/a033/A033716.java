package irvine.oeis.a033;
// manually 2023.01.13; eulerxfm 0 at 2020-08-17 18:03

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A033716 Number of integer solutions to the equation x^2 + 3y^2 = n.
 * @author Georg Fischer
 */
public class A033716 extends EulerTransform {

  /** Construct the sequence. */
  public A033716() {
    super(1, new PeriodicSequence(2, -3, 4, -1, 2, -6, 2, -1, 4, -3, 2, -2), 1);
  }
}

package irvine.oeis.a165;
// manually 2024-06-11/eultra1  at 2024-06-15 19:21

import irvine.oeis.a005.A005177;
import irvine.oeis.transform.EulerTransform;

/**
 * A165647 Number of simple graphs on n vertices with each component regular.
 * @author Georg Fischer
 */
public class A165647 extends EulerTransform {

  /** Construct the sequence. */
  public A165647() {
    super(1, new A005177().skip(1), 1);
    next();
  }
}

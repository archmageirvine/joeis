package irvine.oeis.a104;
// manually etman at 2023-02-01 22:30

import irvine.oeis.a000.A000244;
import irvine.oeis.transform.EulerTransform;

/**
 * A104460 Number of hierarchical orderings for n unlabeled elements with 2 possible classes for levels l&gt;=2.
 * @author Georg Fischer
 */
public class A104460 extends EulerTransform {

  /** Construct the sequence. */
  public A104460() {
    super(1, new A000244());
  }
}

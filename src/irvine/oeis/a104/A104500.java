package irvine.oeis.a104;
// manually etman at 2023-02-01 22:30

import irvine.oeis.SkipSequence;
import irvine.oeis.a034.A034691;
import irvine.oeis.transform.EulerTransform;

/**
 * A104500 Number of different groupings among the hierarchical orderings of n unlabeled elements.
 * @author Georg Fischer
 */
public class A104500 extends EulerTransform {

  /** Construct the sequence. */
  public A104500() {
    super(1, new SkipSequence(new A034691(), 1));
  }
}

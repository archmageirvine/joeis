package irvine.oeis.a002;

import irvine.oeis.CycleTransformSequence;
import irvine.oeis.a000.A000081;

/**
 * A002861 Number of connected functions (or mapping patterns) on n unlabeled points, or number of rings and branches with n edges.
 * @author Sean A. Irvine
 */
public class A002861 extends CycleTransformSequence {

  /** Construct the sequence. */
  public A002861() {
    super(new A000081(), 1);
    super.next();
  }
}

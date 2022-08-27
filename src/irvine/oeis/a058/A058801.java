package irvine.oeis.a058;

import irvine.oeis.a006.A006966;
import irvine.oeis.a051.A051573;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A058801 Number of connected vertically indecomposable partial lattices on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A058801 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A058801() {
    super(new A051573(new A006966()), 1);
    next();
    next();
  }
}

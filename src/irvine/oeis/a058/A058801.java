package irvine.oeis.a058;

import irvine.oeis.a006.A006966;
import irvine.oeis.transform.InverseEulerTransform;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A058801 Number of connected vertically indecomposable partial lattices on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A058801 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A058801() {
    super(2, new InverseInvertTransform(0, new A006966(), 2), 1);
    next();
    next();
  }
}

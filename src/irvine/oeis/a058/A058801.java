package irvine.oeis.a058;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A058801 Number of connected vertically indecomposable partial lattices on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A058801 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A058801() {
    super(2, new A058800().skip(2), 1);
    next();
    next();
  }
}

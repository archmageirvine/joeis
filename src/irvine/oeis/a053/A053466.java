package irvine.oeis.a053;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A053466 Number of connected 3-multigraphs.
 * @author Sean A. Irvine
 */
public class A053466 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A053466() {
    super(new A053400(), 0);
    next();
  }
}

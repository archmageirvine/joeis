package irvine.oeis.a053;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A053517 Number of connected directed 2-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A053517 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A053517() {
    super(new A053467(), 0);
    next();
  }
}

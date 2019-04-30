package irvine.oeis.a005;

import irvine.oeis.InverseEulerTransformSequence;
import irvine.oeis.a129.A129427;

/**
 * A005967 Number of isomorphism classes of connected 3-regular multigraphs of order <code>2n</code>, loops allowed.
 * @author Sean A. Irvine
 */
public class A005967 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A005967() {
    super(new A129427(), 1);
    next();
  }
}

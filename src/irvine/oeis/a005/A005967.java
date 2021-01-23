package irvine.oeis.a005;

import irvine.oeis.InverseEulerTransform;
import irvine.oeis.a129.A129427;

/**
 * A005967 Number of isomorphism classes of connected 3-regular multigraphs of order 2n, loops allowed.
 * @author Sean A. Irvine
 */
public class A005967 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A005967() {
    super(new A129427(), 1);
    next();
  }
}

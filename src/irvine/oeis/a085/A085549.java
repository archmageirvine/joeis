package irvine.oeis.a085;

import irvine.oeis.a129.A129429;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A085549 Number of isomorphism classes of connected 4-regular multigraphs of order n, loops allowed.
 * @author Sean A. Irvine
 */
public class A085549 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A085549() {
    super(1, new A129429().prepend(1), 1);
    skip();
  }
}

package irvine.oeis.a129;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A129430 Number of isomorphism classes of connected 5-regular multigraphs of order 2n, loops allowed.
 * @author Gregory Morse
 */
public class A129430 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A129430() {
    super(1, new A129431());
  }
}

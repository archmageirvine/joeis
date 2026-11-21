package irvine.oeis.a129;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A129434 Number of isomorphism classes of connected 7-regular multigraphs of order 2n, loops allowed.
 * @author Gregory Morse
 */
public class A129434 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A129434() {
    super(1, new A129435());
  }
}

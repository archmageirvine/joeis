package irvine.oeis.a129;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A129436 Number of isomorphism classes of connected 8-regular multigraphs of order n, loops allowed.
 * @author Gregory Morse
 */
public class A129436 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A129436() {
    super(1, new A129437());
  }
}

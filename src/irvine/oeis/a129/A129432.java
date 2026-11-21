package irvine.oeis.a129;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A129432 Number of isomorphism classes of connected 6-regular multigraphs of order n, loops allowed.
 * @author Gregory Morse
 */
public class A129432 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A129432() {
    super(1, new A129433());
  }
}

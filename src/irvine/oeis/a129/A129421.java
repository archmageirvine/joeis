package irvine.oeis.a129;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A129421 Number of isomorphism classes of connected 6-regular loopless multigraphs of order n.
 * @author Gregory Morse
 */
public class A129421 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A129421() {
    super(1, new A129422());
  }
}

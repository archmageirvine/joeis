package irvine.oeis.a129;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A129425 Number of isomorphism classes of connected 8-regular loopless multigraphs of order n.
 * @author Gregory Morse
 */
public class A129425 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A129425() {
    super(1, new A129426());
  }
}

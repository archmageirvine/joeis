package irvine.oeis.a129;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A129417 Number of isomorphism classes of connected 4-regular loopless multigraphs of order n.
 * @author Gregory Morse
 */
public class A129417 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A129417() {
    super(new A129418(), 1);
  }
}

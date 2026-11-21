package irvine.oeis.a129;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A129423 Number of isomorphism classes of connected 7-regular loopless multigraphs of order 2n.
 * @author Gregory Morse
 */
public class A129423 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A129423() {
    super(1, new A129424());
  }
}

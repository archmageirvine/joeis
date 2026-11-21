package irvine.oeis.a129;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A129419 Number of isomorphism classes of connected 5-regular loopless multigraphs of order 2n.
 * @author Gregory Morse
 */
public class A129419 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A129419() {
    super(1, new A129420());
  }
}

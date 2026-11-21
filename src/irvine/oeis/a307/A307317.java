package irvine.oeis.a307;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A307317 Number of unlabeled connected leafless loopless multigraphs with n edges.
 * @author Gregory Morse
 */
public class A307317 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A307317() {
    super(new A307316(), 1);
  }
}

package irvine.oeis.a075;

import irvine.oeis.InverseSequence;

/**
 * A075403 Smallest k such that the difference between the k-th triangular number and the following prime is equal to n.
 * @author Sean A. Irvine
 */
public class A075403 extends InverseSequence {

  /** Construct the sequence. */
  public A075403() {
    super(0, 0, new A075402());
  }
}

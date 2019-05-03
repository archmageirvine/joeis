package irvine.oeis.a270;

import irvine.oeis.FiniteSequence;

/**
 * A270542 Numbers of the form <code>(pq)^2</code>, where p is the number of digits of <code>n (A055642)</code> and q is the sum of the digits of <code>n (A007953)</code>.
 * @author Georg Fischer
 */
public class A270542 extends FiniteSequence {

  /** Construct the sequence. */
  public A270542() {
    super(0, 1, 2704, 5184, 7744);
  }
}

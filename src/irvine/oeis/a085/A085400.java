package irvine.oeis.a085;

import irvine.oeis.DifferenceSequence;

/**
 * A085400 a(n) = abs(A085061(n-1) - A085061(n)).
 * @author Sean A. Irvine
 */
public class A085400 extends DifferenceSequence {

  /** Construct the sequence. */
  public A085400() {
    super(1, new A085061(), true);
  }
}

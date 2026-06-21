package irvine.oeis.a085;

import irvine.oeis.FilterPositionSequence;

/**
 * A085492 Numbers n having no partition into distinct divisors of n+1.
 * @author Sean A. Irvine
 */
public class A085492 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085492() {
    super(1, 0, new A085491(), ZERO);
  }
}

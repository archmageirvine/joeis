package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026287 a(n) = sum of the numbers between the two n's in A026284.
 * @author Sean A. Irvine
 */
public class A026287 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026287() {
    super(new A026284());
  }
}

package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026279 a(n) = sum of the numbers between the two n's in A026276.
 * @author Sean A. Irvine
 */
public class A026279 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026279() {
    super(new A026276());
  }
}

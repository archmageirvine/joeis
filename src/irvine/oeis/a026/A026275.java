package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026275 Sum of numbers between the two n's in A026272.
 * @author Sean A. Irvine
 */
public class A026275 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026275() {
    super(new A026272());
  }
}

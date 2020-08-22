package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026271 a(n) = sum of the numbers between the two n's in A026242.
 * @author Sean A. Irvine
 */
public class A026271 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026271() {
    super(new A026242());
  }
}

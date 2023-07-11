package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026357 a(n) = sum of the numbers between the two n's in A026354.
 * @author Sean A. Irvine
 */
public class A026357 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026357() {
    super(3, new A026354(), 3);
  }
}

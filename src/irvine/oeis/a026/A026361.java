package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026361 a(n) = sum of the numbers between the two n's in A026358.
 * @author Sean A. Irvine
 */
public class A026361 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026361() {
    super(new A026358(), 2);
  }
}

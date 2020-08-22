package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026283 a(n) = sum of the numbers between the two n's in A026280.
 * @author Sean A. Irvine
 */
public class A026283 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026283() {
    super(new A026280());
  }
}

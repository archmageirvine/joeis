package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026369 a(n) = sum of the numbers between the two n's in A026366.
 * @author Sean A. Irvine
 */
public class A026369 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026369() {
    super(new A026366(), 2);
  }
}

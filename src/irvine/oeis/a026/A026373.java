package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026373 a(n) = sum of the numbers between the two n's in A026370.
 * @author Sean A. Irvine
 */
public class A026373 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026373() {
    super(new A026370(), 2);
  }
}

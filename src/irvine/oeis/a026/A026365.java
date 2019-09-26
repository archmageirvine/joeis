package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026365 Sum of the numbers between the two n's in <code>A026362</code>.
 * @author Sean A. Irvine
 */
public class A026365 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026365() {
    super(new A026362(), 2);
  }
}

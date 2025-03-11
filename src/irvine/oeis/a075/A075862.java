package irvine.oeis.a075;

import irvine.oeis.FilterPositionSequence;

/**
 * A075862 Numbers m such that the least k such that (m-k) divides (m+k) is prime.
 * @author Sean A. Irvine
 */
public class A075862 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A075862() {
    super(1, 2, new A075861(), PRIME);
  }
}

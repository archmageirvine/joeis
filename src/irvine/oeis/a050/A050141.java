package irvine.oeis.a050;

import irvine.oeis.DifferenceSequence;

/**
 * A050141 a(n) = 2*floor((n+1)*phi) - 2*floor(n*phi) - 1 where phi = (1 + sqrt(5))/2 is the golden ratio.
 * @author Sean A. Irvine
 */
public class A050141 extends DifferenceSequence {

  /** Construct the sequence. */
  public A050141() {
    super(new A050140());
  }
}

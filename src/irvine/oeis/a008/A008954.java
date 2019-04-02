package irvine.oeis.a008;

import irvine.oeis.PeriodicSequence;

/**
 * A008954 Final digit of triangular number n*(n+1)/2.
 * @author Sean A. Irvine
 */
public class A008954 extends PeriodicSequence {

  /** Construct the sequence. */
  public A008954() {
    super(0, 1, 3, 6, 0, 5, 1, 8, 6, 5, 5, 6, 8, 1, 5, 0, 6, 3, 1, 0);
  }
}

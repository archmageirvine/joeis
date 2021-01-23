package irvine.oeis.a008;

import irvine.oeis.PeriodicSequence;

/**
 * A008959 Final digit of squares: n^2 mod 10.
 * @author Sean A. Irvine
 */
public class A008959 extends PeriodicSequence {

  /** Construct the sequence. */
  public A008959() {
    super(0, 1, 4, 9, 6, 5, 6, 9, 4, 1);
  }
}

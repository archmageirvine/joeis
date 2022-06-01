package irvine.oeis.a008;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A008960 Final digit of cubes: n^3 mod 10.
 * @author Sean A. Irvine
 */
public class A008960 extends PeriodicSequence {

  /** Construct the sequence. */
  public A008960() {
    super(0, 1, 8, 7, 4, 5, 6, 3, 2, 9);
  }
}

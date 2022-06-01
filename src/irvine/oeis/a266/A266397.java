package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266397 Number of orbits of Aut(Z^7) as function of the infinity norm n of the representative lattice point of the orbit, when the cardinality of the orbit is equal to 26880.
 * @author Sean A. Irvine
 */
public class A266397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266397() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 9, 31});
  }
}

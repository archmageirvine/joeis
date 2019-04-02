package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266396 Number of orbits of Aut(Z^7) as function of the infinity norm n of the representative lattice point of the orbit, when the cardinality of the orbit is equal to 80640.
 * @author Sean A. Irvine
 */
public class A266396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266396() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 10, 41});
  }
}

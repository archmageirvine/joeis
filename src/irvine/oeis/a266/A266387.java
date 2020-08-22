package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266387 Number of orbits of Aut(Z^7) as function of the infinity norm n of the representative lattice point of the orbit, when the cardinality of the orbit is equal to 322560.
 * @author Sean A. Irvine
 */
public class A266387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266387() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 0, 0, 0, 7});
  }
}

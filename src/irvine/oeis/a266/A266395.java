package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266395 Number of orbits of Aut(Z^7) as function of the infinity norm n of the representative lattice point of the orbit, when the cardinality of the orbit is equal to 161280.
 * @author Sean A. Irvine
 */
public class A266395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266395() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 0, 15});
  }
}

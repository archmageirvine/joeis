package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266398 Number of orbits of <code>Aut(Z^7)</code> as function of the infinity norm n of the representative lattice point of the orbit, when the cardinality of the orbit is equal to 13440.
 * @author Sean A. Irvine
 */
public class A266398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266398() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 12, 37});
  }
}

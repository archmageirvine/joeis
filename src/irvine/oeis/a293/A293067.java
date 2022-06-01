package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293067 Sum of values of vertices of type A at level n of the hyperbolic Pascal pyramid PP_(4,5).
 * @author Sean A. Irvine
 */
public class A293067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293067() {
    super(new long[] {0, 0, 2, -6, 5}, new long[] {0, 0, 2, 6, 18});
  }
}

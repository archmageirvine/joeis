package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293070 Sum of values of vertices at level n of the hyperbolic Pascal pyramid PP_(4,5).
 * @author Sean A. Irvine
 */
public class A293070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293070() {
    super(new long[] {14, -19, 8}, new long[] {1, 3, 9});
  }
}

package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264237 Sum of values of vertices at level n of the hyperbolic Pascal pyramid.
 * @author Sean A. Irvine
 */
public class A264237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264237() {
    super(new long[] {-12, 92, -224, 226, -99, 18}, new long[] {1, 3, 9, 33, 165, 1137});
  }
}

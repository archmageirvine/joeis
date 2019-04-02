package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264236 Number of vertices at level n of the hyperbolic Pascal pyramid.
 * @author Sean A. Irvine
 */
public class A264236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264236() {
    super(new long[] {1, -12, 37, -37, 12}, new long[] {1, 3, 6, 13, 36});
  }
}

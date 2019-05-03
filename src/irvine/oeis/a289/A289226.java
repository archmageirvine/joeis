package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289226 Number of ways to select 5 disjoint point triples from an <code>n X n X n</code> triangular point grid, each point triple forming a <code>2 X 2 X 2</code> triangle.
 * @author Sean A. Irvine
 */
public class A289226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289226() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 420, 15108, 190371, 1336320, 6528948, 24951780, 79851975, 223419840, 562591836, 1301255556});
  }
}

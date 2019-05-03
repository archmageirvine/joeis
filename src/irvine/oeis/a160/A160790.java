package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160790 Vertex number of a rectangular spiral. The first differences <code>(A160791)</code> are the edge lengths of the spiral. The distances between two nearest edges, that are parallel to the initial edge, are the natural numbers.
 * @author Sean A. Irvine
 */
public class A160790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160790() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 1, 2, 4, 7, 10, 16});
  }
}

package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174395 The number of different 4-colorings for the vertices of all triangulated planar polygons on a base with n vertices if the colors of two adjacent boundary vertices are fixed.
 * @author Sean A. Irvine
 */
public class A174395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174395() {
    super(new long[] {6, -5, -5, 5}, new long[] {0, 2, 10, 40});
  }
}

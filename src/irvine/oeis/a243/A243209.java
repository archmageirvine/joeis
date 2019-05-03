package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243209 Number of inequivalent <code>(mod D_3)</code> ways to place 4 points on a triangular grid of side n so that they are not vertices of an equilateral triangle with sides parallel to the grid.
 * @author Sean A. Irvine
 */
public class A243209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243209() {
    super(new long[] {1, -3, 0, 6, 0, -6, -8, 12, 9, -13, -6, 6, 13, -9, -12, 8, 6, 0, -6, 0, 3}, new long[] {1, 25, 186, 881, 3146, 9264, 23810, 55058, 117205, 233135, 438544, 786541, 1354696, 2252202, 3630684, 5694984, 8718963, 13060515, 19184110, 27681103, 39300096});
  }
}

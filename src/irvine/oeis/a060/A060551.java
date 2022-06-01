package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060551 a(n) is the number of nonsymmetric patterns (no reflective, nor rotational symmetry) which may be formed by an equilateral triangular arrangement of closely packed black and white cells satisfying the local matching rule of Pascal's triangle modulo 2, where n is the number of cells in each edge of the arrangement. The matching rule is such that any elementary top-down triangle of three neighboring cells in the arrangement contains either one or three white cells.
 * @author Sean A. Irvine
 */
public class A060551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060551() {
    super(new long[] {-16, 8, 8, 4, -4, -4, 10, -4, -4, -2, 2, 2}, new long[] {0, 0, 0, 6, 12, 42, 84, 210, 420, 924, 1860, 3900});
  }
}

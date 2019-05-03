package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060548 <code>a(n)</code> is the number of D3-symmetric patterns that may be formed with a top-down equilateral triangular arrangement of closely packed black and white cells satisfying the local matching rule of Pascal's triangle modulo 2, where n is the number of cells in each edge of the arrangement. The matching rule is such that any elementary top-down triangle of three neighboring cells in the arrangement contains either one or three white cells.
 * @author Sean A. Irvine
 */
public class A060548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060548() {
    super(new long[] {2, 0, 0, 0, 0, 0}, new long[] {2, 1, 2, 2, 2, 2});
  }
}

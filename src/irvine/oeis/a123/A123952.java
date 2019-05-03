package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123952 Sum of first row of the <code>5 X 5</code> matrix <code>M^n</code>, where <code>M={5,-1,0,0,0},{-1,5,-1,0,0},{0, -1,5,-1,0},{0,0,-1,5,-1},{0,0,0,-1,5}</code>.
 * @author Sean A. Irvine
 */
public class A123952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123952() {
    super(new long[] {110, -72, 15}, new long[] {1, 4, 17});
  }
}

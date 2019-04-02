package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270062 Number of tilings of a 2 X n rectangle using monominoes and trominoes of any shape.
 * @author Sean A. Irvine
 */
public class A270062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270062() {
    super(new long[] {-1, -1, 1, 5, 5, 1}, new long[] {1, 1, 5, 14, 45, 140});
  }
}

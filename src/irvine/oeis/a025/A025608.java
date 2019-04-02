package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025608 Number of n-move rook paths on 8 X 8 board from given corner to opposite corner.
 * @author Sean A. Irvine
 */
public class A025608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025608() {
    super(new long[] {-168, -44, 18}, new long[] {0, 0, 2});
  }
}

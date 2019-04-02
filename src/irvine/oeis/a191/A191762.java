package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191762 Digital roots of the nonzero even squares.
 * @author Sean A. Irvine
 */
public class A191762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191762() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {4, 7, 9, 1, 1, 9, 7, 4, 9});
  }
}

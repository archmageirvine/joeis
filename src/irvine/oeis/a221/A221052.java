package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221052.
 * @author Sean A. Irvine
 */
public class A221052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221052() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {2071, 73675, 796915, 5807107, 35057827});
  }
}

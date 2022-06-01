package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128499 Fifth column (m=4) of triangle A128494.
 * @author Sean A. Irvine
 */
public class A128499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128499() {
    super(new long[] {1, -1, 5, -5, 10, -10, 10, -10, 5, -5, 1}, new long[] {1, 1, -4, -4, 11, 11, -24, -24, 46, 46, -80});
  }
}

package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191698.
 * @author Sean A. Irvine
 */
public class A191698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191698() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 38, 204, 585, 1280, 2370});
  }
}

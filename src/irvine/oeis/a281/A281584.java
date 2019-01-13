package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281584.
 * @author Sean A. Irvine
 */
public class A281584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281584() {
    super(new long[] {-1, 0, 8, 0}, new long[] {2, 7, 23, 58});
  }
}

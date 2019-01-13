package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182788.
 * @author Sean A. Irvine
 */
public class A182788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182788() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 6, 192, 1620, 7680});
  }
}

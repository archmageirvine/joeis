package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059403.
 * @author Sean A. Irvine
 */
public class A059403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059403() {
    super(new long[] {1, -2, -1, 4, -2, 0, 2, -4, 1, 2}, new long[] {0, 0, 0, 1, 4, 9, 20, 36, 64, 100});
  }
}

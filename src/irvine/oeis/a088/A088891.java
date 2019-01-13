package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088891.
 * @author Sean A. Irvine
 */
public class A088891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088891() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 38, 481, 3355, 16120, 60071, 186238, 502386});
  }
}

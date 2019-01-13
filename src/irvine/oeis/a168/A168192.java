package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168192.
 * @author Sean A. Irvine
 */
public class A168192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168192() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 40, 405, 2176, 8125, 23976});
  }
}

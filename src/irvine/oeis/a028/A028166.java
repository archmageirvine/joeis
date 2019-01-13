package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028166.
 * @author Sean A. Irvine
 */
public class A028166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028166() {
    super(new long[] {-1890, 1173, -269, 27}, new long[] {1, 27, 460, 6330});
  }
}

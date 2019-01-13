package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165130.
 * @author Sean A. Irvine
 */
public class A165130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165130() {
    super(new long[] {8, -14, 7}, new long[] {0, 31, 189});
  }
}

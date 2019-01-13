package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267276.
 * @author Sean A. Irvine
 */
public class A267276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267276() {
    super(new long[] {2048, -2048, 0, -256, 248, 8, 0, 1}, new long[] {1, 7, 19, 123, 283, 1883, 5083, 30939});
  }
}

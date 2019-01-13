package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152620.
 * @author Sean A. Irvine
 */
public class A152620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152620() {
    super(new long[] {-6, -8}, new long[] {1, -2});
  }
}

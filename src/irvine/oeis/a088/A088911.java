package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088911.
 * @author Sean A. Irvine
 */
public class A088911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088911() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 1, 1, 0});
  }
}

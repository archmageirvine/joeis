package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128803.
 * @author Sean A. Irvine
 */
public class A128803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128803() {
    super(new long[] {729, -243, 27}, new long[] {0, 0, 162});
  }
}

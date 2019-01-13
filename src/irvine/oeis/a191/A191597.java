package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191597.
 * @author Sean A. Irvine
 */
public class A191597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191597() {
    super(new long[] {4, 3, 3}, new long[] {0, 1, 6});
  }
}

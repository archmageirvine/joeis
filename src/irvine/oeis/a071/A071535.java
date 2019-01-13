package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071535.
 * @author Sean A. Irvine
 */
public class A071535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071535() {
    super(new long[] {1024, -1280, 640, -160, 20}, new long[] {1, 15, 176, 1680, 13824});
  }
}

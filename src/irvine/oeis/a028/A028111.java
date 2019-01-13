package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028111.
 * @author Sean A. Irvine
 */
public class A028111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028111() {
    super(new long[] {-1080, 786, -209, 24}, new long[] {1, 24, 367, 4578});
  }
}

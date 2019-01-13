package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195037.
 * @author Sean A. Irvine
 */
public class A195037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195037() {
    super(new long[] {1, -3, 3}, new long[] {0, 17, 51});
  }
}

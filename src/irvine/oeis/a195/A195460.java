package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195460.
 * @author Sean A. Irvine
 */
public class A195460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195460() {
    super(new long[] {8, -14, 7}, new long[] {1, 19, 103});
  }
}

package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214525.
 * @author Sean A. Irvine
 */
public class A214525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214525() {
    super(new long[] {-49, 49, -23, 7}, new long[] {0, 1, 7, 19});
  }
}

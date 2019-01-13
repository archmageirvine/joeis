package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060488.
 * @author Sean A. Irvine
 */
public class A060488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060488() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 13, 28, 50});
  }
}

package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128834.
 * @author Sean A. Irvine
 */
public class A128834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128834() {
    super(new long[] {-1, 1}, new long[] {0, 1});
  }
}

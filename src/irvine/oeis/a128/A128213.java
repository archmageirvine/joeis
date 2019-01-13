package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128213.
 * @author Sean A. Irvine
 */
public class A128213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128213() {
    super(new long[] {-1, 2, -3, 2}, new long[] {1, 1, 1, -1});
  }
}

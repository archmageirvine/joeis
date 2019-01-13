package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216175.
 * @author Sean A. Irvine
 */
public class A216175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216175() {
    super(new long[] {1, -3, 2, 1, 0, -1, -2, 3}, new long[] {1, 6, 20, 50, 104, 193, 329, 526});
  }
}

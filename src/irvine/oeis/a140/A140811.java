package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140811.
 * @author Sean A. Irvine
 */
public class A140811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140811() {
    super(new long[] {1, -3, 3}, new long[] {-1, 5, 23});
  }
}

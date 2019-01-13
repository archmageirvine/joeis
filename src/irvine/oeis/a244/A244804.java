package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244804.
 * @author Sean A. Irvine
 */
public class A244804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244804() {
    super(new long[] {1, -3, 3}, new long[] {1, 14, 51});
  }
}

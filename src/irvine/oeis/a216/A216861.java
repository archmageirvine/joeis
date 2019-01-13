package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216861.
 * @author Sean A. Irvine
 */
public class A216861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216861() {
    super(new long[] {-13, 91, -182, 156, -65, 13}, new long[] {0, -2, -9, -44, -215, -1001});
  }
}

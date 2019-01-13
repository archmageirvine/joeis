package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049675.
 * @author Sean A. Irvine
 */
public class A049675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049675() {
    super(new long[] {-1, -5, -2, 5}, new long[] {0, 1, 5, 22});
  }
}

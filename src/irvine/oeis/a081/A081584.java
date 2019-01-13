package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081584.
 * @author Sean A. Irvine
 */
public class A081584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081584() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 13, 79, 307, 886});
  }
}

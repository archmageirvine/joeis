package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267747.
 * @author Sean A. Irvine
 */
public class A267747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267747() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 30});
  }
}

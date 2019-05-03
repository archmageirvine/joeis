package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091701 Row sums of triangle <code>A091700</code>.
 * @author Sean A. Irvine
 */
public class A091701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091701() {
    super(new long[] {-1, -2, 3, 4}, new long[] {1, 3, 14, 63});
  }
}

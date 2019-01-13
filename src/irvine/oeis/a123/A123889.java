package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123889.
 * @author Sean A. Irvine
 */
public class A123889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123889() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4}, new long[] {1, 4, 16, 58, 208, 740, 2628});
  }
}

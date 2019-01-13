package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172073.
 * @author Sean A. Irvine
 */
public class A172073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172073() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 15, 54});
  }
}

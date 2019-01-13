package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234576.
 * @author Sean A. Irvine
 */
public class A234576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234576() {
    super(new long[] {1, 3, 1, 1}, new long[] {4, 7, 14, 34});
  }
}

package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111694.
 * @author Sean A. Irvine
 */
public class A111694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111694() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 8, 26, 57});
  }
}

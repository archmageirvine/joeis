package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251732.
 * @author Sean A. Irvine
 */
public class A251732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251732() {
    super(new long[] {9, -6}, new long[] {1, -3});
  }
}

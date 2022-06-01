package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081626 2*6^n-4^n.
 * @author Sean A. Irvine
 */
public class A081626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081626() {
    super(new long[] {-24, 10}, new long[] {1, 8});
  }
}

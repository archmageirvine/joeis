package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175602 8*(10^n-3).
 * @author Sean A. Irvine
 */
public class A175602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175602() {
    super(1, new long[] {-10, 11}, new long[] {56, 776});
  }
}

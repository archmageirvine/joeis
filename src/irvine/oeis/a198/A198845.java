package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198845 8*6^n-1.
 * @author Sean A. Irvine
 */
public class A198845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198845() {
    super(new long[] {-6, 7}, new long[] {7, 47});
  }
}

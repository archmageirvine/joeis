package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198688 6*7^n-1.
 * @author Sean A. Irvine
 */
public class A198688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198688() {
    super(new long[] {-7, 8}, new long[] {5, 41});
  }
}

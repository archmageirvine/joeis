package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081655 2*5^n-1.
 * @author Sean A. Irvine
 */
public class A081655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081655() {
    super(new long[] {-5, 6}, new long[] {1, 9});
  }
}

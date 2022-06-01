package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081627 2*7^n-5^n.
 * @author Sean A. Irvine
 */
public class A081627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081627() {
    super(new long[] {-35, 12}, new long[] {1, 9});
  }
}

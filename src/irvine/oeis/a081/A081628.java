package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081628 a(n) = 2*(-1)^n - (-5)^n.
 * @author Sean A. Irvine
 */
public class A081628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081628() {
    super(new long[] {-5, -6}, new long[] {1, 3});
  }
}

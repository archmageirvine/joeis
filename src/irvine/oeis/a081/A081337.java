package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081337 a(n) = (8^n + 4^n)/2.
 * @author Sean A. Irvine
 */
public class A081337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081337() {
    super(new long[] {-32, 12}, new long[] {1, 6});
  }
}

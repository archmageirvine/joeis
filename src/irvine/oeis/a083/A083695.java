package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083695 a(n) = 2*a(n-1) + 5*a(n-2).
 * @author Sean A. Irvine
 */
public class A083695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083695() {
    super(new long[] {5, 2}, new long[] {0, 3});
  }
}

package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128969 a(n) = (n^3 - n)*9^n.
 * @author Sean A. Irvine
 */
public class A128969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128969() {
    super(1, new long[] {-6561, 2916, -486, 36}, new long[] {0, 486, 17496, 393660});
  }
}

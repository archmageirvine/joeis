package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083099 a(n) = 2*a(n-1) + 6*a(n-2), a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A083099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083099() {
    super(new long[] {6, 2}, new long[] {0, 1});
  }
}

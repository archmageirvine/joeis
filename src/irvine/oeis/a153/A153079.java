package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153079 a(n) = 13^n + 2.
 * @author Sean A. Irvine
 */
public class A153079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153079() {
    super(new long[] {-13, 14}, new long[] {3, 15});
  }
}

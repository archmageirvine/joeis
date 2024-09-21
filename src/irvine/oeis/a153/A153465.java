package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153465 a(n) = 9*4^n - 2.
 * @author Sean A. Irvine
 */
public class A153465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153465() {
    super(1, new long[] {-4, 5}, new long[] {34, 142});
  }
}

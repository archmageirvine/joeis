package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101946 a(n) = 6*2^n - 3*n - 5.
 * @author Sean A. Irvine
 */
public class A101946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101946() {
    super(new long[] {2, -5, 4}, new long[] {1, 4, 13});
  }
}

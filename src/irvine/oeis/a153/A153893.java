package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153893 <code>a(n) = 3*2^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A153893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153893() {
    super(new long[] {-2, 3}, new long[] {2, 5});
  }
}

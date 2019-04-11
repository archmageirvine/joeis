package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153894 <code>a(n) = 5*2^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A153894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153894() {
    super(new long[] {-2, 3}, new long[] {4, 9});
  }
}

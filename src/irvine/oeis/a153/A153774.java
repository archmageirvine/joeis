package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153774 <code>a(2*n) = 3*a(2*n-1), a(2*n+1) = 3*a(2*n) - 1,</code> with <code>a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A153774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153774() {
    super(new long[] {-3, 1, 3}, new long[] {1, 3, 8});
  }
}

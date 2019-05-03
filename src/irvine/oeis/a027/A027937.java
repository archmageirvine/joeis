package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027937 <code>a(n) = T(2*n, n+1)</code>, T given by <code>A027935</code>.
 * @author Sean A. Irvine
 */
public class A027937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027937() {
    super(new long[] {-1, 5, -8, 5}, new long[] {1, 7, 26, 79});
  }
}

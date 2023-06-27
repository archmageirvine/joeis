package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168202 a(n) = 3*n - a(n-1) + 1 with n &gt; 1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A168202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168202() {
    super(1, new long[] {-1, 1, 1}, new long[] {5, 2, 8});
  }
}

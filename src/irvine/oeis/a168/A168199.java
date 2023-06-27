package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168199 a(n) = 3*n - a(n-1) + 1 with n &gt; 1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A168199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168199() {
    super(1, new long[] {-1, 1, 1}, new long[] {2, 5, 5});
  }
}

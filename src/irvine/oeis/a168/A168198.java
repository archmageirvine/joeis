package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168198 a(n) = 3*n - a(n-1) + 1 with n &gt; 1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A168198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168198() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 6, 4});
  }
}

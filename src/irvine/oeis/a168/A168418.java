package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168418 a(n) = 9*n - a(n-1) - 8 with n&gt;1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A168418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168418() {
    super(1, new long[] {-1, 1, 1}, new long[] {5, 5, 14});
  }
}

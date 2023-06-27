package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168373 a(n) = 7*n - a(n-1) - 6 with n&gt;1, a(1)=4.
 * @author Sean A. Irvine
 */
public class A168373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168373() {
    super(1, new long[] {-1, 1, 1}, new long[] {4, 4, 11});
  }
}

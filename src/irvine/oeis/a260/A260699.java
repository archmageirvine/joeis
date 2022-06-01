package irvine.oeis.a260;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A260699 a(2n+6) = a(2n) + 12*n + 20, a(2n+1) = (n+1)*(2*n+1), with a(0)=0, a(2)=2, a(4)=9.
 * @author Sean A. Irvine
 */
public class A260699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260699() {
    super(new long[] {1, -1, -1, 1, 0, 0, -1, 1, 1}, new long[] {0, 1, 2, 6, 9, 15, 20, 28, 34});
  }
}

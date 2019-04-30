package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260699 <code>a(2n+6) = a(2n) + 12*n + 20, a(2n+1) = (n+1)*(2*n+1)</code>, with <code>a(0)=0, a(2)=2, a(4)=9</code>.
 * @author Sean A. Irvine
 */
public class A260699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260699() {
    super(new long[] {1, -1, -1, 1, 0, 0, -1, 1, 1}, new long[] {0, 1, 2, 6, 9, 15, 20, 28, 34});
  }
}

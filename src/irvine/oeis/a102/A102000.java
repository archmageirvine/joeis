package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102000 a(0),...,a(3) = 1, 2, 4, 8; thereafter a(n) = a(n-1) + 2*a(n-2) + 4*a(n-3) + 8*a(n-4), n&gt;3.
 * @author Sean A. Irvine
 */
public class A102000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102000() {
    super(new long[] {8, 4, 2, 1}, new long[] {1, 2, 4, 8});
  }
}

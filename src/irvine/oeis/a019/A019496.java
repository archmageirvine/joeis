package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019496 <code>a(n) = 3*a(n-1) - 3*a(n-3) + 2*a(n-4),</code> with <code>a(0)=4, a(1)=11</code>.
 * @author Sean A. Irvine
 */
public class A019496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019496() {
    super(new long[] {2, -3, 0, 3}, new long[] {4, 11, 30, 81});
  }
}

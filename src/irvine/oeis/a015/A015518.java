package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015518 a(n) = 2*a(n-1) + 3*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A015518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015518() {
    super(new long[] {3, 2}, new long[] {0, 1});
  }
}

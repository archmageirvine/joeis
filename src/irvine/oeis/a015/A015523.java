package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015523 a(n) = 3*a(n-1) + 5*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A015523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015523() {
    super(new long[] {5, 3}, new long[] {0, 1});
  }
}

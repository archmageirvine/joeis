package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076452 a(n+2) = abs(a(n+1)) - a(n), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A076452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076452() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 0, -1, 1, 2, 1, -1});
  }
}

package irvine.oeis.a183;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A183188 a(n) = 3*a(n-1) + a(n-3) with a(0)=1, a(1)=2, a(2)=6.
 * @author Sean A. Irvine
 */
public class A183188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183188() {
    super(new long[] {1, 0, 3}, new long[] {1, 2, 6});
  }
}

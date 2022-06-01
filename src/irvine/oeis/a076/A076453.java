package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076453 a(n+2) = abs(a(n+1)) - a(n), a(0)=1, a(1)=0.
 * @author Sean A. Irvine
 */
public class A076453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076453() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, -1, 1, 2, 1, -1, 0, 1});
  }
}

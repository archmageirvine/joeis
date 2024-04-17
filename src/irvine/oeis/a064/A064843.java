package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064843 a(n) = A064842(n)/2.
 * @author Sean A. Irvine
 */
public class A064843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064843() {
    super(1, new long[] {-1, 3, -2, -2, 3}, new long[] {0, 1, 3, 9, 18});
  }
}

package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131041 a(n) = 2*a(n-1) - a(n-2) - a(n-4).
 * @author Sean A. Irvine
 */
public class A131041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131041() {
    super(new long[] {-1, 0, -1, 2}, new long[] {1, 1, 1, -1});
  }
}

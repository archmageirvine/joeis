package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107401 a(n) = -a(n-1)+4*a(n-2)+4*a(n-3)-a(n-4)-a(n-5).
 * @author Sean A. Irvine
 */
public class A107401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107401() {
    super(new long[] {-1, -1, 4, 4, -1}, new long[] {0, 1, 1, 2, 3});
  }
}

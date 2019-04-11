package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084174 <code>a(n) = 3*a(n-1) - a(n-2) - 3*a(n-3) + 2*a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A084174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084174() {
    super(new long[] {2, -3, -1, 3}, new long[] {1, 1, 3, 6});
  }
}

package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091142 a(n) = 2*a(n-1) + 4*a(n-2) - 2*a(n-3) with initial terms 1, 2, 6.
 * @author Sean A. Irvine
 */
public class A091142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091142() {
    super(1, new long[] {-2, 4, 2}, new long[] {1, 2, 6});
  }
}

package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084707 a(0) = 1, a(1) = 3, a(2) = 9, a(3) = 27; a(n) = 3*a(n-1) - 3*a(n-3) + a(n-4) for n &gt; 3.
 * @author Sean A. Irvine
 */
public class A084707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084707() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 3, 9, 27});
  }
}

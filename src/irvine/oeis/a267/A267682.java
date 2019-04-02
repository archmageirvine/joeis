package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267682 a(n) = 2*a(n-1) - 2*a(n-3) + a(n-4) for n &gt; 3, with initial terms 1, 1, 4, 8.
 * @author Sean A. Irvine
 */
public class A267682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267682() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 1, 4, 8});
  }
}

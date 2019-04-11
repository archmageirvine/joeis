package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027688 <code>a(n) = n^2 + n + 3</code>.
 * @author Sean A. Irvine
 */
public class A027688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027688() {
    super(new long[] {1, -3, 3}, new long[] {3, 5, 9});
  }
}

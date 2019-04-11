package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142463 <code>a(n) = 2*n^2 + 2*n - 1</code>.
 * @author Sean A. Irvine
 */
public class A142463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142463() {
    super(new long[] {1, -3, 3}, new long[] {-1, 3, 11});
  }
}

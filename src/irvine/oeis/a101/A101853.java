package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101853 a(n) = n*(20 + 15*n + n^2)/6.
 * @author Sean A. Irvine
 */
public class A101853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101853() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {6, 18, 37, 64});
  }
}

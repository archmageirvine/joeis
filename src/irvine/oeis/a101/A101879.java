package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101879 a(0) = 1, a(1) = 1, a(2) = 2; for n &gt; 2, a(n) = 5*a(n-1) - 5*a(n-2) + a(n-3).
 * @author Sean A. Irvine
 */
public class A101879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101879() {
    super(new long[] {1, -5, 5}, new long[] {1, 1, 2});
  }
}

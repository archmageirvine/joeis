package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059826 <code>a(n) = (n^2 - n + 1)*(n^2 + n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A059826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059826() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 21, 91, 273});
  }
}

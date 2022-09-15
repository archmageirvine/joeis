package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107417 a(n) = C(n+2,2)*C(n+5,5).
 * @author Sean A. Irvine
 */
public class A107417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107417() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 18, 126, 560, 1890, 5292, 12936, 28512});
  }
}

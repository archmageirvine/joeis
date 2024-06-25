package irvine.oeis.a002;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A002798 a(n) = a(n-1) + a(n-2) - a(n-3).
 * @author Sean A. Irvine
 */
public class A002798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002798() {
    super(1, new long[] {-1, 0, 1, 1, 0}, new long[] {18, 45, 69, 96, 120});
  }
}

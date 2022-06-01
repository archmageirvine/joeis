package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074501 a(n) = 1^n + 2^n + 5^n.
 * @author Sean A. Irvine
 */
public class A074501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074501() {
    super(new long[] {10, -17, 8}, new long[] {3, 8, 30});
  }
}

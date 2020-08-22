package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258807 a(n) = n^5 - 1.
 * @author Sean A. Irvine
 */
public class A258807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258807() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 31, 242, 1023, 3124, 7775});
  }
}

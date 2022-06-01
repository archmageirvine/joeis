package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178671 a(n) = 5^n - 5.
 * @author Sean A. Irvine
 */
public class A178671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178671() {
    super(new long[] {-5, 6}, new long[] {-4, 0});
  }
}

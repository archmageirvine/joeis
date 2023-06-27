package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083322 a(n) = 2^n - A081374(n).
 * @author Sean A. Irvine
 */
public class A083322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083322() {
    super(1, new long[] {2, -1, 0, 2}, new long[] {1, 2, 6, 11});
  }
}

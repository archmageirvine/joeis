package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155632 a(n) = 11^n - 4^n + 1^n.
 * @author Sean A. Irvine
 */
public class A155632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155632() {
    super(new long[] {44, -59, 16}, new long[] {1, 8, 106});
  }
}

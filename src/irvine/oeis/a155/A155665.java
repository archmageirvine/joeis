package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155665 a(n) = 11^n + 8^n - 1.
 * @author Sean A. Irvine
 */
public class A155665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155665() {
    super(new long[] {88, -107, 20}, new long[] {1, 18, 184});
  }
}

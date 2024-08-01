package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155625 a(n) = 11^n + 4^n - 1.
 * @author Sean A. Irvine
 */
public class A155625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155625() {
    super(new long[] {44, -59, 16}, new long[] {1, 14, 136});
  }
}

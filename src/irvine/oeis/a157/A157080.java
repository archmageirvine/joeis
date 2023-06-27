package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157080 a(n) = 32805000*n^2 - 16200*n + 1.
 * @author Sean A. Irvine
 */
public class A157080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157080() {
    super(1, new long[] {1, -3, 3}, new long[] {32788801, 131187601, 295196401});
  }
}

package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100504 a(n) = (4*n^3 + 6*n^2 + 8*n + 6)/3.
 * @author Sean A. Irvine
 */
public class A100504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100504() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 8, 26, 64});
  }
}

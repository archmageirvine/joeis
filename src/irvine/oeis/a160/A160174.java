package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160174 a(n) = (2*n - 1)*(24*n^2 - 42*n + 19).
 * @author Sean A. Irvine
 */
public class A160174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160174() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 93, 545, 1645});
  }
}

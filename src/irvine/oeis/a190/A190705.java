package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190705 a(n) = 6*n^2*(2*n + 1).
 * @author Sean A. Irvine
 */
public class A190705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190705() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 18, 120, 378});
  }
}

package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178222 Partial sums of <code>floor(3^n/4)</code>.
 * @author Sean A. Irvine
 */
public class A178222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178222() {
    super(new long[] {3, -4, -2, 4}, new long[] {0, 2, 8, 28});
  }
}

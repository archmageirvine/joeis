package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054452 Partial sums of <code>A027941(n-1)</code> with <code>a(-1) = 0</code>.
 * @author Sean A. Irvine
 */
public class A054452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054452() {
    super(new long[] {-1, 5, -8, 5}, new long[] {0, 0, 1, 5});
  }
}

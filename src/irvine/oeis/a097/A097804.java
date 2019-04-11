package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097804 <code>a(n) = 3*(2*5^n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A097804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097804() {
    super(new long[] {-5, 6}, new long[] {9, 33});
  }
}

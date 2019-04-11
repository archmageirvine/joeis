package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024051 <code>a(n) = 5^n - n^2</code>.
 * @author Sean A. Irvine
 */
public class A024051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024051() {
    super(new long[] {-5, 16, -18, 8}, new long[] {1, 4, 21, 116});
  }
}

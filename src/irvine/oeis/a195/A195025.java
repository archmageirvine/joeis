package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195025 <code>a(n) = n*(14*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A195025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195025() {
    super(new long[] {1, -3, 3}, new long[] {0, 17, 62});
  }
}

package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175166 <code>a(n) = 64*(2^n - 1)</code>.
 * @author Sean A. Irvine
 */
public class A175166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175166() {
    super(new long[] {-2, 3}, new long[] {0, 64});
  }
}

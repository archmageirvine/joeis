package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175165 <code>a(n) = 32*(2^n - 1)</code>.
 * @author Sean A. Irvine
 */
public class A175165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175165() {
    super(new long[] {-2, 3}, new long[] {0, 32});
  }
}

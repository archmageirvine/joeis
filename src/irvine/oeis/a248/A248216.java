package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248216 a(n) = 6^n - 2^n.
 * @author Sean A. Irvine
 */
public class A248216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248216() {
    super(new long[] {-12, 8}, new long[] {0, 4});
  }
}

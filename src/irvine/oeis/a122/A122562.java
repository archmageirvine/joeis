package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122562 <code>a(n) = n^3 + 114 *</code> n.
 * @author Sean A. Irvine
 */
public class A122562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122562() {
    super(new long[] {-1, 4, -6, 4}, new long[] {115, 236, 369, 520});
  }
}

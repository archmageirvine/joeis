package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157947 a(n) = 98n + 1.
 * @author Sean A. Irvine
 */
public class A157947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157947() {
    super(1, new long[] {-1, 2}, new long[] {99, 197});
  }
}

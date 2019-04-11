package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157947 <code>a(n) = 98n + 1</code>.
 * @author Sean A. Irvine
 */
public class A157947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157947() {
    super(new long[] {-1, 2}, new long[] {99, 197});
  }
}

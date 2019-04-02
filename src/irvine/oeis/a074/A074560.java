package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074560 a(n) = 3^n + 8^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074560() {
    super(new long[] {216, -123, 20}, new long[] {3, 20, 154});
  }
}

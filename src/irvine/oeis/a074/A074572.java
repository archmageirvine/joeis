package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074572 a(n) = 5^n + 6^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074572() {
    super(new long[] {240, -118, 19}, new long[] {3, 19, 125});
  }
}

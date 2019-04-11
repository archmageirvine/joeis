package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074554 <code>a(n) = 3^n + 5^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074554() {
    super(new long[] {135, -87, 17}, new long[] {3, 17, 115});
  }
}

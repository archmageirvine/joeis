package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074576 a(n) = 5^n + 8^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074576() {
    super(new long[] {360, -157, 22}, new long[] {3, 22, 170});
  }
}

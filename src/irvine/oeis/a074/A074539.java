package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074539 a(n) = 2^n + 5^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074539() {
    super(new long[] {80, -66, 15}, new long[] {3, 15, 93});
  }
}

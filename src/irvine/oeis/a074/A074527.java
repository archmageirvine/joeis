package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074527 a(n) = 2^n + 3^n + 5^n.
 * @author Sean A. Irvine
 */
public class A074527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074527() {
    super(new long[] {30, -31, 10}, new long[] {3, 10, 38});
  }
}

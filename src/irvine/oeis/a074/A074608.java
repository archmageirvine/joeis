package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074608 a(n) = 3^n + 7^n.
 * @author Sean A. Irvine
 */
public class A074608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074608() {
    super(new long[] {-21, 10}, new long[] {2, 10});
  }
}

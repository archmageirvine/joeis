package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074550 a(n) = 3^n + 4^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074550() {
    super(new long[] {96, -68, 15}, new long[] {3, 15, 89});
  }
}

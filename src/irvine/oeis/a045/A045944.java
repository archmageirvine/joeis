package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045944 Rhombic matchstick numbers: a(n) = n*(3*n+2).
 * @author Sean A. Irvine
 */
public class A045944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045944() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 16});
  }
}

package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056084 Numbers n such that <code>n^8 = 1 (mod 9^3)</code>.
 * @author Sean A. Irvine
 */
public class A056084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056084() {
    super(new long[] {-1, 1, 1}, new long[] {1, 728, 730});
  }
}

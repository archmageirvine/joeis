package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188716 a(n) = n + (n-1)*(2^n-2).
 * @author Sean A. Irvine
 */
public class A188716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188716() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 1, 4, 15});
  }
}

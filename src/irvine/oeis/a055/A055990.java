package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055990 a(n) is its own 4th difference.
 * @author Sean A. Irvine
 */
public class A055990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055990() {
    super(new long[] {-1, 4, -6, 5}, new long[] {1, 4, 14, 50});
  }
}

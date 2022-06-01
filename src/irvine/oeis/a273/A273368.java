package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273368 Numbers k such that 10*k+9 is a perfect square.
 * @author Sean A. Irvine
 */
public class A273368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273368() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 4, 16, 28, 52});
  }
}

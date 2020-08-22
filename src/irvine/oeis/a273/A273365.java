package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273365 Numbers k such that 10*k+4 is a perfect square.
 * @author Sean A. Irvine
 */
public class A273365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273365() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 6, 14, 32, 48});
  }
}

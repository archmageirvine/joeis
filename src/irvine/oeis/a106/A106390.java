package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106390 Numbers k such that 13k = 6j^2 + 6j + 1.
 * @author Sean A. Irvine
 */
public class A106390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106390() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {1, 61, 97, 277, 349});
  }
}

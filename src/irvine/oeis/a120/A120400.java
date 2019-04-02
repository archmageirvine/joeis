package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120400 Expansion of 1/(1-x-x^2-x^6).
 * @author Sean A. Irvine
 */
public class A120400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120400() {
    super(new long[] {1, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 8});
  }
}

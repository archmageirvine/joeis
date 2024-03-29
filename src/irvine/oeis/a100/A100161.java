package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100161 Structured disdyakis dodecahedral numbers (vertex structure 9).
 * @author Sean A. Irvine
 */
public class A100161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100161() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 26, 115, 308});
  }
}

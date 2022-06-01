package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100173 Structured pentakis dodecahedral numbers (vertex structure 6).
 * @author Sean A. Irvine
 */
public class A100173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100173() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 32, 148, 404});
  }
}

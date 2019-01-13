package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100150.
 * @author Sean A. Irvine
 */
public class A100150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100150() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 24, 107, 288});
  }
}

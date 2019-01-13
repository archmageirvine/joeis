package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100305.
 * @author Sean A. Irvine
 */
public class A100305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100305() {
    super(new long[] {-8, 7, 2}, new long[] {1, 1, 5});
  }
}

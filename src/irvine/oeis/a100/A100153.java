package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100153 Structured truncated dodecahedral numbers.
 * @author Sean A. Irvine
 */
public class A100153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100153() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 60, 276, 748});
  }
}

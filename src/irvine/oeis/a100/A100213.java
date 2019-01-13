package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100213.
 * @author Sean A. Irvine
 */
public class A100213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100213() {
    super(new long[] {-16, 24, -16, 4, 4, -6, 4}, new long[] {4, 9, 14, 18, 32, 64, 128});
  }
}

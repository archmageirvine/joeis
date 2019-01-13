package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100139.
 * @author Sean A. Irvine
 */
public class A100139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100139() {
    super(new long[] {3, 0, 0, 8, -12, 6}, new long[] {1, 2, 4, 8, 16, 32});
  }
}

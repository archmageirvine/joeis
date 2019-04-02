package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100103 2^(2*n)-(2*n).
 * @author Sean A. Irvine
 */
public class A100103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100103() {
    super(new long[] {4, -9, 6}, new long[] {1, 2, 12});
  }
}

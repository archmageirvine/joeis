package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100412 a(n) = 8*10^n - 7.
 * @author Sean A. Irvine
 */
public class A100412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100412() {
    super(new long[] {-10, 11}, new long[] {1, 73});
  }
}

package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100182.
 * @author Sean A. Irvine
 */
public class A100182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100182() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 8, 28, 68});
  }
}

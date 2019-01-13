package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053422.
 * @author Sean A. Irvine
 */
public class A053422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053422() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 1, 22, 333});
  }
}

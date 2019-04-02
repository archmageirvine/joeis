package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260316 n/3 if 3 divides n, else n-1.
 * @author Sean A. Irvine
 */
public class A260316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260316() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 0, 1, 1, 3, 4});
  }
}

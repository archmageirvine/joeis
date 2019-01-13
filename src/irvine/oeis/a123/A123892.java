package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123892.
 * @author Sean A. Irvine
 */
public class A123892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123892() {
    super(new long[] {2, -2, 6, -3, 3}, new long[] {1, 3, 9, 24, 63});
  }
}

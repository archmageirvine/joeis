package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167784.
 * @author Sean A. Irvine
 */
public class A167784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167784() {
    super(new long[] {-6, 3, 2}, new long[] {1, 0, 4});
  }
}

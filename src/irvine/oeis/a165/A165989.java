package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165989 Numbers such that n^2 = 29 mod 1193.
 * @author Sean A. Irvine
 */
public class A165989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165989() {
    super(new long[] {-1, 1, 1}, new long[] {534, 659, 1727});
  }
}

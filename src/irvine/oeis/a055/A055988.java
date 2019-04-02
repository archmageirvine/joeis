package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055988 Sequence is its own 4th difference.
 * @author Sean A. Irvine
 */
public class A055988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055988() {
    super(new long[] {-1, 4, -6, 5}, new long[] {1, 2, 7, 26});
  }
}

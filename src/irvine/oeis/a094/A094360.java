package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094360 Pair reversal of Jacobsthal-Lucas numbers.
 * @author Sean A. Irvine
 */
public class A094360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094360() {
    super(new long[] {4, 4, -1}, new long[] {1, 2, 7});
  }
}

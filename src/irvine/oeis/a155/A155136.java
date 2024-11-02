package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155136 Integers k such that k + 28 is a square.
 * @author Sean A. Irvine
 */
public class A155136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155136() {
    super(1, new long[] {1, -3, 3}, new long[] {-28, -27, -24});
  }
}

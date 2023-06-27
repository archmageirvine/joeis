package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095262 A sequence derived from a truncated Pascal's Triangle matrix.
 * @author Sean A. Irvine
 */
public class A095262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095262() {
    super(1, new long[] {24, -26, 9}, new long[] {2, 21, 137});
  }
}

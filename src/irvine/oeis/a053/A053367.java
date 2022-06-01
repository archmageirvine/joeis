package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053367 Partial sums of A050494.
 * @author Sean A. Irvine
 */
public class A053367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053367() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 11, 63, 255, 825, 2277, 5577, 12441, 25740});
  }
}

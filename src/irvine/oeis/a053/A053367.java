package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053367 Partial sums of <code>A050494</code>.
 * @author Sean A. Irvine
 */
public class A053367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053367() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 11, 63, 255, 825, 2277, 5577, 12441, 25740});
  }
}

package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125198 Number of magical labelings of the octahedral graph of magic sum n.
 * @author Sean A. Irvine
 */
public class A125198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125198() {
    super(new long[] {1, -6, 14, -14, 0, 14, -14, 6}, new long[] {1, 8, 40, 144, 417, 1032, 2272, 4568});
  }
}

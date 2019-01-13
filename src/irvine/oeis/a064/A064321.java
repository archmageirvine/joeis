package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064321.
 * @author Sean A. Irvine
 */
public class A064321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064321() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 0, 0, 864, 17280, 144000, 756000, 2963520});
  }
}

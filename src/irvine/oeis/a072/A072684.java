package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072684.
 * @author Sean A. Irvine
 */
public class A072684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072684() {
    super(new long[] {1, -3, -1, 5, 1}, new long[] {2, 3, 16, 31, 103});
  }
}

package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190173.
 * @author Sean A. Irvine
 */
public class A190173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190173() {
    super(new long[] {-1, 2, 4, -6, -2, 4}, new long[] {0, 1, 5, 17, 52, 148});
  }
}

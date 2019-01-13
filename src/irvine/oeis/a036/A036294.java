package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036294.
 * @author Sean A. Irvine
 */
public class A036294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036294() {
    super(new long[] {-64, 16}, new long[] {0, 8});
  }
}

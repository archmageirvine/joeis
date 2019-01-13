package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220236.
 * @author Sean A. Irvine
 */
public class A220236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220236() {
    super(new long[] {8, -14, 7}, new long[] {9, 51, 231});
  }
}

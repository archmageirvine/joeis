package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139570.
 * @author Sean A. Irvine
 */
public class A139570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139570() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 20});
  }
}

package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177107 3*(10^n-7).
 * @author Sean A. Irvine
 */
public class A177107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177107() {
    super(1, new long[] {-10, 11}, new long[] {9, 279});
  }
}

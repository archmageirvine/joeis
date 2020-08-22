package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198794 5*6^n-1.
 * @author Sean A. Irvine
 */
public class A198794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198794() {
    super(new long[] {-6, 7}, new long[] {4, 29});
  }
}

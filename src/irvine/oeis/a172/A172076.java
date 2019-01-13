package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172076.
 * @author Sean A. Irvine
 */
public class A172076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172076() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 17, 62});
  }
}

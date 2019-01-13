package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172082.
 * @author Sean A. Irvine
 */
public class A172082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172082() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 21, 78});
  }
}

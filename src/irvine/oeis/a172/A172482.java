package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172482.
 * @author Sean A. Irvine
 */
public class A172482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172482() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 16, 47, 104});
  }
}

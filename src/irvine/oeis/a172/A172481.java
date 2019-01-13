package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172481.
 * @author Sean A. Irvine
 */
public class A172481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172481() {
    super(new long[] {-4, 0, 3}, new long[] {1, 2, 5});
  }
}

package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077917.
 * @author Sean A. Irvine
 */
public class A077917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077917() {
    super(new long[] {-2, 4, -1}, new long[] {1, -1, 5});
  }
}

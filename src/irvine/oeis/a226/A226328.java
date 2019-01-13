package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226328.
 * @author Sean A. Irvine
 */
public class A226328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226328() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {1, -2, 2, 1, 2});
  }
}

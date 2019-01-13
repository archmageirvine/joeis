package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172225.
 * @author Sean A. Irvine
 */
public class A172225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172225() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 2, 24, 96, 260});
  }
}

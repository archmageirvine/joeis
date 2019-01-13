package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077924.
 * @author Sean A. Irvine
 */
public class A077924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077924() {
    super(new long[] {-2, 2, 2, -1}, new long[] {1, -1, 3, -3});
  }
}

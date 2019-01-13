package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175714.
 * @author Sean A. Irvine
 */
public class A175714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175714() {
    super(new long[] {4, -5, 1, 1}, new long[] {-1, -1, -2, 2});
  }
}

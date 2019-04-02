package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063942 Follow k with k-1 and k-2.
 * @author Sean A. Irvine
 */
public class A063942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063942() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 0, -1, 2});
  }
}

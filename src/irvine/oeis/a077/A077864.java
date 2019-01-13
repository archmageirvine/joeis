package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077864.
 * @author Sean A. Irvine
 */
public class A077864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077864() {
    super(new long[] {-1, -1, 1, 2}, new long[] {1, 2, 5, 11});
  }
}

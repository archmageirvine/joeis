package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077445 Numbers k such that (k^2 - 8)/2 is a square.
 * @author Sean A. Irvine
 */
public class A077445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077445() {
    super(new long[] {-1, 6}, new long[] {4, 20});
  }
}

package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077444 Numbers k such that <code>(k^2 + 4)/2</code> is a square.
 * @author Sean A. Irvine
 */
public class A077444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077444() {
    super(new long[] {-1, 6}, new long[] {2, 14});
  }
}

package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222182 Numbers m such that <code>2*m+11</code> is a square.
 * @author Sean A. Irvine
 */
public class A222182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222182() {
    super(new long[] {1, -3, 3}, new long[] {-5, -1, 7});
  }
}

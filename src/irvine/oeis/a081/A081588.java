package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081588 Fourth row of the Pascal-(1,4,1) array A081579.
 * @author Sean A. Irvine
 */
public class A081588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081588() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 16, 106, 396});
  }
}

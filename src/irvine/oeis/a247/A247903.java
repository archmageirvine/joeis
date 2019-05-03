package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247903 Start with a single square; at n-th generation add a square at each expandable vertex (this is the "vertex to side" <code>version); a(n)</code> is the sum of all label values at n-th generation. (See comment for construction <code>rules.)</code>.
 * @author Sean A. Irvine
 */
public class A247903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247903() {
    super(new long[] {2, -4, 1, 2}, new long[] {1, 5, 13, 29});
  }
}

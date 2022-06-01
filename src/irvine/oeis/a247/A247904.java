package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247904 Start with a single pentagon; at n-th generation add a pentagon at each expandable vertex (this is the "vertex to side" version); a(n) is the sum of all label values at n-th generation. (See comment for construction rules.).
 * @author Sean A. Irvine
 */
public class A247904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247904() {
    super(new long[] {2, -5, 4}, new long[] {1, 6, 21});
  }
}

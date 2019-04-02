package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247619 Start with a single pentagon; at n-th generation add a pentagon at each expandable vertex; a(n) is the sum of all label values at n-th generation. (See comment for construction rules.).
 * @author Sean A. Irvine
 */
public class A247619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247619() {
    super(new long[] {2, -4, 1, 2}, new long[] {1, 6, 16, 36});
  }
}

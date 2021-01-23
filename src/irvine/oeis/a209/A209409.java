package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209409 Number of subsets of {1,...,n} containing {a,a+2,a+4} for some a.
 * @author Sean A. Irvine
 */
public class A209409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209409() {
    super(new long[] {2, 1, -1, -4, -2, 2, -4, 2, -2, 3}, new long[] {0, 0, 0, 0, 0, 4, 15, 37, 87, 200});
  }
}

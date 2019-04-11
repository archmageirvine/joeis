package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209408 Number of subsets of <code>{1,...,n}</code> containing <code>{a,a+4}</code> for some a.
 * @author Sean A. Irvine
 */
public class A209408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209408() {
    super(new long[] {2, 1, -3, 1, 4, 2, -6, 2, -4, -2, 6, -2, -2, -1, 3}, new long[] {0, 0, 0, 0, 0, 8, 28, 74, 175, 377, 799, 1673, 3471, 7192, 14784});
  }
}

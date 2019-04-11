package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061547 Number of 132 and 213-avoiding derangements of <code>{1,2,...,n}</code>.
 * @author Sean A. Irvine
 */
public class A061547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061547() {
    super(new long[] {-4, 4, 1}, new long[] {0, 1, 2});
  }
}

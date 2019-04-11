package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213498 Number of (w,x,y) with all terms in <code>{0,...,n}</code> and w <code>!=</code> max(|w-x|,|x-y|,|y-w|).
 * @author Sean A. Irvine
 */
public class A213498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213498() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 4, 15, 43, 88, 164});
  }
}

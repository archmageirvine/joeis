package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213495 Number of (w,x,y) with all terms in <code>{0,...,n}</code> and w = min(|w-x|,|x-y|,|y-w|).
 * @author Sean A. Irvine
 */
public class A213495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213495() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {1, 4, 9, 16, 27, 38});
  }
}

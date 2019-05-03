package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084570 Partial sums of <code>A084263</code>.
 * @author Sean A. Irvine
 */
public class A084570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084570() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 2, 6, 12, 23});
  }
}

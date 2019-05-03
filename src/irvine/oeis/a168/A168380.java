package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168380 Row sums of <code>A168281</code>.
 * @author Sean A. Irvine
 */
public class A168380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168380() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {2, 4, 12, 20, 38, 56});
  }
}

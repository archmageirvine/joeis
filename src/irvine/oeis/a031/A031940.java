package irvine.oeis.a031;

import irvine.oeis.LinearRecurrence;

/**
 * A031940 Length of longest legal domino snake using full set of dominoes up to [n:n].
 * @author Sean A. Irvine
 */
public class A031940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A031940() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 3, 6, 9, 15});
  }
}

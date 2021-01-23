package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212682 Number of (w,x,y,z) with all terms in {1,...,n} and |x-y|&gt;=|y-z|.
 * @author Sean A. Irvine
 */
public class A212682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212682() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 1, 12, 57, 168, 395, 792});
  }
}

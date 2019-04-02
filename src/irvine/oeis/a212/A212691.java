package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212691 Number of (w,x,y,z) with all terms in {1,...,n} and w+|x-y|&lt;=|x-z|+|y-z|.
 * @author Sean A. Irvine
 */
public class A212691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212691() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 0, 2, 8, 26, 50, 100});
  }
}

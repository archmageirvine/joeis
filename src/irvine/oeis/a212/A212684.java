package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212684 Number of (w,x,y,z) with all terms in {1,...,n} and  |x-y|=n-w+|y-z|.
 * @author Sean A. Irvine
 */
public class A212684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212684() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 1, 6, 19, 42});
  }
}

package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212685 Number of (w,x,y,z) with all terms in {1,...,n} and |w-x|=w+|y-z|.
 * @author Sean A. Irvine
 */
public class A212685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212685() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 0, 2, 7, 18});
  }
}

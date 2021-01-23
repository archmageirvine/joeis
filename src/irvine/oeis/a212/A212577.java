package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212577 Number of (w,x,y,z) with all terms in {1,...,n} and |w-x|=2|x-y|-|y-z|.
 * @author Sean A. Irvine
 */
public class A212577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212577() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {0, 1, 4, 17, 46, 89, 154, 251});
  }
}

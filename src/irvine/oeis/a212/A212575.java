package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212575 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>2|w-x|=|x-y|+|y-z|</code>.
 * @author Sean A. Irvine
 */
public class A212575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212575() {
    super(new long[] {-1, 0, 2, 2, -1, -4, -1, 2, 2, 0}, new long[] {0, 1, 4, 17, 42, 85, 142, 235, 346, 495});
  }
}

package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212678 Number of (w,x,y,z) with all terms in <code>{1,</code>...,n} and w+x+y=|x-y|+|y-z|.
 * @author Sean A. Irvine
 */
public class A212678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212678() {
    super(new long[] {-1, 1, 1, 1, -2, -2, 1, 1, 1}, new long[] {0, 0, 0, 0, 5, 14, 28, 53, 87});
  }
}

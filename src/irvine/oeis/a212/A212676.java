package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212676 Number of (w,x,y,z) with all terms in <code>{1,</code>...,n} and w+x=|x-y|+|y-z|.
 * @author Sean A. Irvine
 */
public class A212676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212676() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 1, 9, 23, 52});
  }
}

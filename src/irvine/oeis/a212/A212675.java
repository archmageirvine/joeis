package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212675 Number of (w,x,y,z) with all terms in <code>{1,</code>...,n} and w&gt;=|x-y|+|y-z|.
 * @author Sean A. Irvine
 */
public class A212675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212675() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 1, 14, 57, 158, 353});
  }
}

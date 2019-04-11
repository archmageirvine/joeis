package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212959 Number of (w,x,y) such that w,x,y are all in <code>{0,</code>...,n} and |w-x| = |x-y|.
 * @author Sean A. Irvine
 */
public class A212959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212959() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 4, 11, 20});
  }
}

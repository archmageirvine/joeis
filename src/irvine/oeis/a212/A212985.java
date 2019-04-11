package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212985 Number of (w,x,y) with all terms in <code>{0,</code>...,n} and 3w=3x+y.
 * @author Sean A. Irvine
 */
public class A212985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212985() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 2, 3, 7, 9, 11, 18});
  }
}

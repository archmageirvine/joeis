package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212740 Number of (w,x,y,z) with all terms in <code>{0,</code>...,n} and max{w,x,y,z}&lt;2*min{w,x,y,z}.
 * @author Sean A. Irvine
 */
public class A212740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212740() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 1, 2, 17, 32, 97, 162, 337});
  }
}

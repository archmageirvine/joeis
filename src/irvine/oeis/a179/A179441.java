package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179441 The number of ways that a,b,c,d,e can be drawn with replacement from the unit interval <code>{1,2,3,4,5,</code>...,n} with the property that a+b+c &lt; d+e. Example: from the unit interval <code>{1,2}</code> there is only one way. <code>{1,1,1}</code> for a,b,c and <code>{2,2}</code> for d,e. From <code>{1,2,3}</code> there are 21 ways to draw a,b,c,d,e such that a+b+c &lt; d+e.
 * @author Sean A. Irvine
 */
public class A179441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179441() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 21, 121, 432, 1182, 2723});
  }
}

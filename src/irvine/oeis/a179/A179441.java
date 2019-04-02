package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179441 The number of ways that a,b,c,d,e can be drawn with replacement from the unit interval {1,2,3,4,5,...,n} with the property that a+b+c &lt; d+e. Example: from the unit interval {1,2} there is only one way. {1,1,1} for a,b,c and {2,2} for d,e. From {1,2,3} there are 21 ways to draw a,b,c,d,e such that a+b+c &lt; d+e.
 * @author Sean A. Irvine
 */
public class A179441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179441() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 21, 121, 432, 1182, 2723});
  }
}

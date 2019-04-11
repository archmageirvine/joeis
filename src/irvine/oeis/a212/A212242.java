package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212242 Number of (u,v,w,x,y,z) with all terms in <code>{0,1,</code>...,n} and 5u=v+w+x+y+z.
 * @author Sean A. Irvine
 */
public class A212242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212242() {
    super(new long[] {-1, 5, -10, 10, -5, 2, -5, 10, -10, 5}, new long[] {1, 2, 53, 204, 625, 1556, 3357, 6558, 11809, 20000});
  }
}

package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212069 Number of (w,x,y,z) with all terms in {1,...,n} and 3*w = x+y+z.
 * @author Sean A. Irvine
 */
public class A212069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212069() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 1, 2, 9, 22, 41});
  }
}

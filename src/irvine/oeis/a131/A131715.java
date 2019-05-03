package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131715 Period <code>12</code>: repeat 0,2,4,0,-6,8,0,-2,-4,0,6,-8.
 * @author Sean A. Irvine
 */
public class A131715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131715() {
    super(new long[] {-1, 0, 0, 0, 0, 0}, new long[] {0, 2, 4, 0, -6, 8});
  }
}

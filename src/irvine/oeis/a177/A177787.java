package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177787 Number of paths from <code>(0,0)</code> to <code>(n+2,n)</code> using only up and right steps and avoiding two or more consecutive moves up or three or more consecutive moves right.
 * @author Sean A. Irvine
 */
public class A177787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177787() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 5, 10, 18});
  }
}

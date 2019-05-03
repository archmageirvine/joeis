package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014125 Bisection of <code>A001400</code>.
 * @author Sean A. Irvine
 */
public class A014125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014125() {
    super(new long[] {-1, 3, -3, 2, -3, 3} , new long[] {1, 3, 6, 11, 18, 27});
  }
}

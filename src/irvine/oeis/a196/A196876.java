package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196876.
 * @author Sean A. Irvine
 */
public class A196876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196876() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, -2, 3}, new long[] {1, 1, 1, 1, 1, 1, 1, 7, 14});
  }
}

package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196279.
 * @author Sean A. Irvine
 */
public class A196279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196279() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, -2, -1, 0, -2, -1, 0, -2, -1, 0, 1});
  }
}

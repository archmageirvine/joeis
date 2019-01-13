package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105660.
 * @author Sean A. Irvine
 */
public class A105660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105660() {
    super(new long[] {-1, 6, -13, 6}, new long[] {3, 10, 27, 49});
  }
}

package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078112.
 * @author Sean A. Irvine
 */
public class A078112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078112() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 1, 2, 0, 0, 5});
  }
}

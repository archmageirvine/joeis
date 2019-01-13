package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078339.
 * @author Sean A. Irvine
 */
public class A078339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078339() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 1, 3, 5, 6, 8, 10});
  }
}

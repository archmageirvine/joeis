package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111721.
 * @author Sean A. Irvine
 */
public class A111721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111721() {
    super(new long[] {-1, 0, 2}, new long[] {1, 1, 7});
  }
}

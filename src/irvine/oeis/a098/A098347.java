package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098347.
 * @author Sean A. Irvine
 */
public class A098347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098347() {
    super(new long[] {-3, 3, 3}, new long[] {1, 5, 16});
  }
}

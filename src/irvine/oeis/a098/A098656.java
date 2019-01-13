package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098656.
 * @author Sean A. Irvine
 */
public class A098656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098656() {
    super(new long[] {-16, 8, 2}, new long[] {0, 1, -2});
  }
}

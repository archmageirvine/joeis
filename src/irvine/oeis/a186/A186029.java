package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186029.
 * @author Sean A. Irvine
 */
public class A186029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186029() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 17});
  }
}

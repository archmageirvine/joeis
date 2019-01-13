package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105770.
 * @author Sean A. Irvine
 */
public class A105770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105770() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 2, 7, 10, 17});
  }
}

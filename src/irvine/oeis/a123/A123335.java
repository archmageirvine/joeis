package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123335.
 * @author Sean A. Irvine
 */
public class A123335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123335() {
    super(new long[] {1, -2}, new long[] {1, -1});
  }
}

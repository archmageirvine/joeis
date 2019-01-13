package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139272.
 * @author Sean A. Irvine
 */
public class A139272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139272() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 22});
  }
}

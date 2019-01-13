package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139398.
 * @author Sean A. Irvine
 */
public class A139398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139398() {
    super(new long[] {2, -5, 10, -10, 5}, new long[] {1, 1, 1, 1, 1});
  }
}

package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132596.
 * @author Sean A. Irvine
 */
public class A132596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132596() {
    super(new long[] {1, -11, 11}, new long[] {0, 2, 24});
  }
}

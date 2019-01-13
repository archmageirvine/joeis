package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255687.
 * @author Sean A. Irvine
 */
public class A255687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255687() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 25, 64});
  }
}

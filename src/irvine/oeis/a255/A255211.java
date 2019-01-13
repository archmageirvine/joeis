package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255211.
 * @author Sean A. Irvine
 */
public class A255211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255211() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 16, 46});
  }
}

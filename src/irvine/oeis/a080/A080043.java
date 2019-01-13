package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080043.
 * @author Sean A. Irvine
 */
public class A080043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080043() {
    super(new long[] {-3, -4, 4, 4}, new long[] {1, 4, 21, 100});
  }
}

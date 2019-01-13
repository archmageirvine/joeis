package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132357.
 * @author Sean A. Irvine
 */
public class A132357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132357() {
    super(new long[] {3, -1, 0, 3}, new long[] {1, 4, 14, 41});
  }
}

package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028159.
 * @author Sean A. Irvine
 */
public class A028159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028159() {
    super(new long[] {-3840, 2144, -416, 34}, new long[] {1, 34, 740, 13160});
  }
}

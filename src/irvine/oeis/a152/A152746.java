package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152746.
 * @author Sean A. Irvine
 */
public class A152746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152746() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 36});
  }
}

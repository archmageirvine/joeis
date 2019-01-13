package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152744.
 * @author Sean A. Irvine
 */
public class A152744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152744() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 35});
  }
}

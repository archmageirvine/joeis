package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152734.
 * @author Sean A. Irvine
 */
public class A152734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152734() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 25});
  }
}

package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152185.
 * @author Sean A. Irvine
 */
public class A152185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152185() {
    super(new long[] {5, -3}, new long[] {1, -5});
  }
}

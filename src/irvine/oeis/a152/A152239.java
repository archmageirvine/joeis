package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152239.
 * @author Sean A. Irvine
 */
public class A152239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152239() {
    super(new long[] {7, -5}, new long[] {1, -7});
  }
}

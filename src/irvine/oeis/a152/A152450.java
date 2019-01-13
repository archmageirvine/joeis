package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152450.
 * @author Sean A. Irvine
 */
public class A152450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152450() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 1, 4, 7});
  }
}

package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277977.
 * @author Sean A. Irvine
 */
public class A277977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277977() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 19, 96, 298});
  }
}

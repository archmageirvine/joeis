package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254284.
 * @author Sean A. Irvine
 */
public class A254284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254284() {
    super(new long[] {1, -1, -194, 194, 1}, new long[] {1, 36, 133, 6888, 25705});
  }
}

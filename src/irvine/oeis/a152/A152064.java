package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152064.
 * @author Sean A. Irvine
 */
public class A152064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152064() {
    super(new long[] {-1, 4, -6, 4}, new long[] {5, 4, 9, 32});
  }
}

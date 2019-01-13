package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269342.
 * @author Sean A. Irvine
 */
public class A269342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269342() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 26, 85, 196});
  }
}

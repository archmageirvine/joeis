package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137719 Sequence based on the pattern [3n, 3n, 3n, 3n+2, 3n+1, 3n+2].
 * @author Sean A. Irvine
 */
public class A137719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137719() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {0, 2, 1, 2, 3});
  }
}

package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256857.
 * @author Sean A. Irvine
 */
public class A256857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256857() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 8, 24});
  }
}

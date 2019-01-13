package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256524.
 * @author Sean A. Irvine
 */
public class A256524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256524() {
    super(new long[] {-1, 2, 0, -2, 2, -2, 0, 2}, new long[] {1, 3, 9, 18, 34, 54, 84, 120});
  }
}

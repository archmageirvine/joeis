package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042963 Numbers congruent to 1 or 2 mod 4.
 * @author Sean A. Irvine
 */
public class A042963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042963() {
    super(new long[] {-1, 1, 1}, new long[] {1, 2, 5});
  }
}

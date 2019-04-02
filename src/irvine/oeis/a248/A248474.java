package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248474 Numbers congruent to 13 or 17 mod 30.
 * @author Sean A. Irvine
 */
public class A248474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248474() {
    super(new long[] {-1, 1, 1}, new long[] {13, 17, 43});
  }
}
